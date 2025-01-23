package com.zmg.book.controller;

import com.zmg.book.entity.Student;
import com.zmg.book.entity.User;
import com.zmg.book.service.oracle.UserOracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserOracleController {
    @Autowired
    private UserOracleService userOracleService;

    @GetMapping("/oracleList")
    public List<Student> list() {
        System.out.println("22222");
        return this.userOracleService.getAll();
    }
}
