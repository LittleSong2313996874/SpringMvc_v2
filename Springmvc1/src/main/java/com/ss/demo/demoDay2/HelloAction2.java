package com.ss.demo.demoDay2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 一个action中写多个业务方法。
 */
@Controller
@RequestMapping(value = "/User")
public class HelloAction2 {

    public HelloAction2() {
        System.out.println("HelloAction()::"+this.hashCode());
    }

    //业务方法，只要是/day2hello.action的请求，都交由HelloAction的hello方法处理
    @RequestMapping(value = "/login")
    public String loginMethod(Model model) throws Exception{
        System.out.println("loginMethod():: 登陆哦你 ! ");
        model.addAttribute("message","登录成功");
        return "success";
    }

    //以下形式都可正常访问，说明前面的 / 和后面的 .action 可以省略
    //支持以下面的形式配置多个路径。
    @RequestMapping(value = {"/register"})
    public String registerMethod(Model model) throws Exception{
        System.out.println("registerMethod():: 它想注册呢! ");
        model.addAttribute("message","注册成功");
        return "success";
    }
}

