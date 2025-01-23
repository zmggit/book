package com.zmg.book.service.mysql.imple;


import com.zmg.book.entity.User;
import com.zmg.book.mapper.mysqlmapper.UserMysqlMapper;
import com.zmg.book.service.mysql.UserMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//避免名称冲突
@Service("mysqlUserService")
public class UserMysqlMysqlServiceImple implements UserMysqlService {
    @Autowired(required = false)
    private UserMysqlMapper userMysqlMapper;
    @Override
    public List<User> getAll() {
        return userMysqlMapper.getAll();
    }

    @Override
    public User selectById(Long id) {
        return userMysqlMapper.selectById(id);
    }
}
