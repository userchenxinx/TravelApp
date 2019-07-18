package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.User;
import com.pinming.travelapp.service.UserService;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.Md5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

         String userPassword = user.getPassword();
         String pwd = Md5Util.encodeByMd5(userPassword);
         user.setPassword(pwd);
         System.out.println(userPassword + "," + pwd);
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
    @ApiModelProperty(value = "查询账号名是否存在注册过")
    public JsonBean checkUserName(String username){
         boolean isExit = userService.checkUserName(username);
         return new JsonBean(1,null);
    }

    @RequestMapping("/registerUser")
    @ResponseBody
    @ApiModelProperty(value = "注册方法接口")
    public JsonBean insertUser(User user) throws Exception {
        String userPassword = user.getPassword();
        String pwd = Md5Util.encodeByMd5(userPassword);
        user.setPassword(pwd);
        System.out.println(userPassword + "," + pwd);
        int result = userService.registerUser(user);

        System.out.println("插入数据后是否可以获取一个值：" + result);
        return  new JsonBean(1,null);
        /*return result > 0 ? "success" : "fail";*/
    }
}
