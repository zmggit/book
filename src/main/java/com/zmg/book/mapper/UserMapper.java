package com.zmg.book.mapper;


import com.zmg.book.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
    User selectById(Long id);
}
