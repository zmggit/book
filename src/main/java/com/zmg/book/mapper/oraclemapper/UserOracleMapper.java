package com.zmg.book.mapper.oraclemapper;

import com.zmg.book.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserOracleMapper {
    List<User> findAll();
    User selectById(Long id);
}