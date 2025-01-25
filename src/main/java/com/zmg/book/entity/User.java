package com.zmg.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private String id;
    private String name;
    private String email;
    private int age;
    private  String remark;
}