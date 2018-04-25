package com.ss.demo.demoDay1;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器action
 */
public class NiHaoAction implements Controller {

    static int i = 1;

    public NiHaoAction() {
        System.out.println("NiHaoAction()构造方法: " + this.hashCode());
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {


        System.out.println("------------NiHaoAction.handleRequest() "+i+"  次");
        // ModelAndView表示向试图封装的数据和路径
        ModelAndView modelAndView = new ModelAndView();
        ;
        modelAndView.addObject("message","   看什么看，说的就是你");
            // 这里 / 代表根目录webroot，这里是一个真实路径
        modelAndView.setViewName("/jsp/success.jsp");
        i ++;

        return modelAndView;
    }
}


