package com.chen.controller;

import com.chen.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by cvter on 2017/6/29.
 */

@RestController
public class IndexController {

    @Autowired
    HelloRemote helloRemote;

    @Value("${name}")
    private String name;
    @GetMapping("/hello/{name}")
    public String eureka(@PathVariable String name){
        System.out.println(name);
        return helloRemote.hello(name);
    }
}
