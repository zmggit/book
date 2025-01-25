package com.zmg.book.service.oracle;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmg.book.entity.Student;
import com.zmg.book.entity.User;

import java.util.List;


public interface UserOracleService extends IService<Student> {
    public List<Student> getAll();
    public Student selectById(Long id);
}


