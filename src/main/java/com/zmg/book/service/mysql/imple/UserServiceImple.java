package com.zmg.book.service.mysql.imple;


import com.zmg.book.entity.User;
import com.zmg.book.mapper.mysqlmapper.UserMapper;
import com.zmg.book.service.mysql.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//避免名称冲突
@Service("mysqlUserService")
public class UserServiceImple implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}
