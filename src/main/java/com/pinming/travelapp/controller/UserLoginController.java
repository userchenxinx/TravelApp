package com.pinming.travelapp.controller;
import com.pinming.travelapp.pojo.User;
import com.pinming.travelapp.service.UserService;
import com.pinming.travelapp.util.CodeUtil;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.Md5Util;
import com.pinming.travelapp.util.SmsUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@Api(value = "登录注册信息",tags = "登录注册信息")
@CrossOrigin
public class UserLoginController {

    @Autowired
     private UserService userService;

     @GetMapping("/login")
     @ResponseBody
     @ApiOperation(value = "这是一个普通用户登录的方法接口")
     public JsonBean UserLogin(String username,String password, HttpSession session) throws Exception {


         String pwd = Md5Util.encodeByMd5(password);
       /*  User user = new User();
         session.setAttribute("checkcode",user.getCode());*/
         System.out.println( password + "," + pwd);
         boolean result =  userService.LoginUser(username,pwd);
         System.out.println(result);
         if (result){

             return  new JsonBean(1,"可登录成功");
         }else {
             return new JsonBean(0,"账号或密码错误");
         }
     }


     //查询用户名是否存在；
    @GetMapping ("/checkUserName")
    @ResponseBody
    @ApiOperation(value = "查询账号名是否存在注册过")
    public JsonBean checkUserName(String username){
         boolean isExit = userService.checkUserName(username);

        if (isExit){
            return  new JsonBean(1,"此用户名已经注册");
        }else {
            return new JsonBean(0,"此用户名可以用");
        }

    }

    @GetMapping("/registerUser")
    @ResponseBody
    @ApiOperation(value = "注册方法接口")
    public String insertUser(User user) throws Exception {
        String userPassword = user.getPassword();
        String pwd = Md5Util.encodeByMd5(userPassword);
        user.setPassword(pwd);
        System.out.println(userPassword + "," + pwd);
        int result = userService.registerUser(user);

        System.out.println("插入数据后是否可以获取一个值：" + result);

        return result > 0 ? "success" : "fail";
    }

    @GetMapping ("/checkUserTel")
    @ResponseBody
    @ApiOperation(value = "查询手机号是否存在注册过")
    public JsonBean checkUserTel(String tel){
        boolean isExit = userService.checkUserTel(tel);

         if(isExit){
             return  new JsonBean(1,"电话号码已注册，输入验证码即可登录");
         }else {
             return  new JsonBean(0,"电话号码第一次浏览，输入正确验证码，将被注册");
         }
    }


    @PostMapping("/sendCode")
    @ResponseBody
    @ApiOperation(value = "用户已存在，修改密码用的发送手机号验证码的接口")
    public JsonBean sendCode(String tel,HttpSession session){
        //发送邮件
        int code = CodeUtil.createCode(6);
        session.setAttribute("checkcode",code);
        SmsUtil.mobileQuery(tel,code);
        //保存验证到数据库，用于校验
        User user =new User();
        user.setTel(tel);
        user.setCode(code);

        userService.updateUserValidateCodeByPhone(user);
        return new JsonBean(1,code);
    }

    @PostMapping("/sendTelCode")
    @ResponseBody
    @ApiOperation(value = "用户第一次登录;发送此登录手机号验证码的接口")
    public JsonBean sendTelCode(String tel){
        //发送邮件
        int code = CodeUtil.createCode(6);
        SmsUtil.mobileQuery(tel,code);
        //保存验证到数据库，用于校验
        User user =new User();
        user.setTel(tel);
        user.setCode(code);
        boolean result  = userService.addUserValidateCodeByPhone(user);
        if(result){
            return new JsonBean(1,code);
        }else {
            return new JsonBean(0,"添加数据库失败");
        }

    }


    @GetMapping("/validateTelCode")
    @ResponseBody
    @ApiOperation(value = "通过手机号验证码验证的登录接口")
    public JsonBean validateTelCode(User user,HttpSession session){

         boolean reasult = userService.validateByTelCode(user);
         if (reasult){
             return new JsonBean(1,"验证成功可登录");
         }else{
             return new JsonBean(0,"验证失败，验证码输入有误");
         }
    }


    @GetMapping("/updatePassword")
    @ResponseBody
    @ApiOperation("更新密码的接口")
    public JsonBean updatePassword(User user ,HttpSession session) throws Exception {

         String password = user.getPassword();
         String pwd = Md5Util.encodeByMd5(password);
         user.setPassword(pwd);
         boolean reasult = userService.validateByTelCode(user);
       if (reasult){
           userService.updateUserPassword(user);
           return new JsonBean(1, "修改密码成功");
       }else
           return  new JsonBean(0,"修改密码失败，可能是验证码输入有误");
       }
    }





