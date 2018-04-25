package com.ss.demo.demoDay2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 一个action中写多个业务方法。
 */
@Controller
@RequestMapping(value = "/User2")
public class HelloAction4 {

    public HelloAction4() {
        System.out.println("HelloAction()::"+this.hashCode());
    }

    // 用户登录，限定只能接受get请求
    @RequestMapping(method = RequestMethod.GET,value = "/login")
    public String loginMethod(Model model, String username) throws Exception{
        System.out.println(""+username );
        model.addAttribute("message","登录成功了，是的，呵呵");
        return "success";
    }

    //  method内部可以放数组，通过下面的形式，表示Post和Get请求都可以处理。
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = {"/register"})
    public String registerMethod(Model model, String username, int salary,String hiredate) throws Exception{
        System.out.println(""+username+":"+salary+":"+hiredate);
        model.addAttribute("message","没错又他妈注册成功了");
        return "success";
    }

}

