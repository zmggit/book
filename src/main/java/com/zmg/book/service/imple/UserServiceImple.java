package com.zmg.book.service.imple;


import com.zmg.book.entity.User;
import com.zmg.book.mapper.UserMapper;
import com.zmg.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
