package com.zmg.book.entity;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private String email;
    private int age;
    private  String remark;
}