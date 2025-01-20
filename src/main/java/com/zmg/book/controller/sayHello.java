package com.zmg.book.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class sayHello {
    @RequestMapping("/")
    public String sayHello() {
        return "sayHello! Java";
    }
}
