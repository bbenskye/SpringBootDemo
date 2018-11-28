package com.wenchao.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/login")
    public String hello(){
        return "{ \"A\": \"hello\",\"B\":\"hello 你大爷！\"}";
    }
}
