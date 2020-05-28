package com.jhm.web.admin;

import com.jhm.pojo.User;
import com.jhm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {

    //调用接口UserService中参数，自动装配
    @Autowired(required = false)
    private UserService userService;

    //登录
    @GetMapping
    public String  loginpage(){
        return "admin/login";
    }

    //登录页面提交的时候，要调用login方法，传参用户名密码
    @RequestMapping("/login")
    public String login(@RequestParam(value = "username",required = false) String username,
                        @RequestParam(value = "password",required = false) String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        User user=userService.usercheck(username,password);
        if (user!=null){    //user不为空，表示用户名与密码正确
            user.setPassword(null); //登录页面不显示密码
            session.setAttribute("user",user);  //将查到的user对象，放入到session中
            return "admin/index";   //再返回到index首页面
        }else {
            //用户名密码不对，给前端页面提示
            attributes.addFlashAttribute("message","用户名密码错误");
            return "redirect:/admin";// 重定向
        }
    }

    //登出，注销
    @GetMapping("loginout")
    public String loginout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }
}
