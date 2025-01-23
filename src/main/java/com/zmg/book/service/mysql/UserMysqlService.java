package com.zmg.book.service.mysql;

import com.zmg.book.entity.User;

import java.util.List;


public interface UserMysqlService {
    public List<User> getAll();
    public User selectById(Long id);
}


