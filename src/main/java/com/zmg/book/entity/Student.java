package com.zmg.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Student {
    private int ID;
    private String NAME;
    private String EMAIL;
    private int AGE;
}