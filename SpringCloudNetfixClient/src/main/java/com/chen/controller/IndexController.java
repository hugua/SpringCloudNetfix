package com.chen.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cvter on 2017/6/29.
 */

@RestController
public class IndexController {

    @PostMapping("/hello")
    public String eureka(@RequestParam String name){
        return "hello " + name;
    }
}
