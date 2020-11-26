package com.heima.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.heima.service.Hello;

@Service
public class HelloImpl implements Hello {

    @Override
    public String sayHello(String name) {
        return "hello"+ name;
    }
}
