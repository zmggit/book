package com.zmg.book.mapper.mysqlmapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmg.book.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMysqlMapper extends BaseMapper<User> {
    List<User> getAll();
    User selectById(Long id);
}
