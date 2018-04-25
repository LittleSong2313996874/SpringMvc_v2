package com.ss.demo.demoDay2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 一个action中写多个业务方法。
 */
@Controller
@RequestMapping(value = "/User3")
public class HelloAction5 {

    public HelloAction5() {
        System.out.println("HelloAction()::"+this.hashCode());
    }

    // 用户登录，限定只能接受get请求
    @RequestMapping(method = RequestMethod.GET,value = "/login")
    public String loginMethod(HttpServletRequest request, HttpServletResponse response) throws Exception{

        //获取用户名和薪水
        String username = request.getParameter("username");
        String salary = request.getParameter("salary");
        System.out.println("");

        return "success";
    }

    //  method内部可以放数组，通过下面的形式，表示Post和Get请求都可以处理。
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = {"/register"})
    public void registerMethod(HttpServletRequest request, HttpServletResponse response ) throws Exception {

        //获取用户名和薪水
        String username = request.getParameter("username");
        String salary = request.getParameter("salary");

        System.out.println("用户注册： " + username + ":" + salary);

        //绑定到域对象中
        request.getSession().setAttribute("username", username);
        request.getSession().setAttribute("salary", salary);

        //重定向到页面
        response.sendRedirect("/jsp/success.jsp");

    }

}

