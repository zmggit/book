package com.zmg.book.controller;


import com.zmg.book.entity.User;
import com.zmg.book.service.mysql.UserMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMysqlService userMysqlService;
    @GetMapping("/list")
    public List<User> list(){
        System.out.println("22222");
        return this.userMysqlService.getAll();
    }
}

