package com.ss.demo.demoDay2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 一个action中写多个业务方法。
 */
@Controller
public class HelloAction {

    public HelloAction() {
        System.out.println("HelloAction()::"+this.hashCode());
    }

    //业务方法，只要是/day2hello.action的请求，都交由HelloAction的hello方法处理
    @RequestMapping(value = "/day2bye.action")
    public String goodBye(Model model) throws Exception{
        System.out.println("goodBye():: The second day Byeeeeeeeeeeee ! ");
        model.addAttribute("message","第二天了哈，再见");
        return "success";
    }

    //以下形式都可正常访问，说明前面的 / 和后面的 .action 可以省略
    //支持以下面的形式配置多个路径。
    @RequestMapping(value = {"day2hello","/a.action","b.action"})
    public String hello(Model model) throws Exception{
        System.out.println("helloAction():: The second day HHHHHHHHHHHELLOOOOOO! ");
        model.addAttribute("message","第二天了哈,你好");
        return "success";
    }
}

