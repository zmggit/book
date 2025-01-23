package com.zmg.book.service.oracle.imple;


import com.zmg.book.entity.User;
import com.zmg.book.mapper.oraclemapper.UserOracleMapper;
import com.zmg.book.service.oracle.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("oracleUserService")
public class UserServiceImple implements UserService {
    @Autowired(required = false)
    private UserOracleMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}
