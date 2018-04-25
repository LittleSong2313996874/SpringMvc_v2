package com.ss.demo.demoDay1;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器action
 */
public class HelloAction implements Controller {

    Logger logger = Logger.getLogger(HelloAction.class);

    static int i = 1;

    public HelloAction() {
        System.out.println("HelloAction()构造方法: " + this.hashCode());
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");

        System.out.println("------------HelloAction.handleRequest() "+i+"  次");
        // ModelAndView表示向试图封装的数据和路径
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","第一次使用Springmvc");
            // 这里 / 代表根目录webroot，这里是一个真实路径
        modelAndView.setViewName("/jsp/success.jsp");
        i ++;

        return modelAndView;
    }
}


