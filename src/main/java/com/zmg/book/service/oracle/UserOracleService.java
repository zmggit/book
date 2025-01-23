package com.zmg.book.service.oracle;

import com.zmg.book.entity.Student;
import com.zmg.book.entity.User;

import java.util.List;


public interface UserOracleService {
    public List<Student> getAll();
    public Student selectById(Long id);
}


