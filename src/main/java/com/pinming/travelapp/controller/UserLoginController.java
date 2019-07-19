package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.User;
import com.pinming.travelapp.service.UserService;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.Md5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@Api(value = "登录注册信息",tags = "登录注册信息")
public class UserLoginController {

    @Autowired
     private UserService userService;

     @GetMapping("/login")
     @ResponseBody
     @ApiOperation(value = "这是一个普通用户登录的方法接口")
     public JsonBean UserLogin(User user, HttpSession session) throws Exception {

         String userpassword = user.getPassword();
         String pwd = Md5Util.encodeByMd5(userpassword);
         user.setPassword(pwd);
         System.out.println( userpassword + "," + pwd);
         boolean result =  userService.LoginUser(user);
         System.out.println(result);
         if (result){
             return  new JsonBean(1,null);
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
    public JsonBean insertUser(User user) throws Exception {
        String userPassword = user.getPassword();
        String pwd = Md5Util.encodeByMd5(userPassword);
        user.setPassword(pwd);
        System.out.println(userPassword + "," + pwd);
        int result = userService.registerUser(user);

        System.out.println("插入数据后是否可以获取一个值：" + result);
        return  new JsonBean(1,"添加数据成功");
        /*return result > 0 ? "success" : "fail";*/
    }
}
