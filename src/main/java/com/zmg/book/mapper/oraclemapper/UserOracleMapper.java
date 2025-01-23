package com.zmg.book.mapper.oraclemapper;

import com.zmg.book.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserOracleMapper {
    List<Student> getAll();
    Student selectById(Long id);
}