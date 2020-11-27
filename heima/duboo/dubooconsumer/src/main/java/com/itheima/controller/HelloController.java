package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloController {


    @Reference
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String getName(String name){
        //call from other service
        String result = helloService.sayHello(name);
        System.out.println(result);
        return  result;
    }
}
