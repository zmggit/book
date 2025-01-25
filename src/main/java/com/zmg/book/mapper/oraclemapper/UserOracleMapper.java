package com.zmg.book.mapper.oraclemapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmg.book.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserOracleMapper extends BaseMapper<Student> {
    List<Student> getAll();
    Student selectById(Long id);
}