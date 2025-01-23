package com.zmg.book.mapper.mysqlmapper;


import com.zmg.book.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMysqlMapper {
    List<User> getAll();
    User selectById(Long id);
}
