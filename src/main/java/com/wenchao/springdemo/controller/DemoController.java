package com.wenchao.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String root(){
        return "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>超哥的Spring</title>\n" +
                "</head>\n" +
                "\n" +
//                "<hr />\n" +
                "<strong>肖明亮最帅！</strong><br />" +
                "";
    }

    @RequestMapping("/login")
    public String hello(){
        return "{ \"A\": \"hello\",\"B\":\"hello 你大爷！\"}";
    }
}
