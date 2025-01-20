package com.zmg.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注解要写@controller而不是@restController，前者用来渲染页面，后者用来返回数据
@Controller
class WebHello {
    @RequestMapping("/webHello")
    //return  templates 下的文件名
    public String sayHello() {
        return "index1";
    }
}