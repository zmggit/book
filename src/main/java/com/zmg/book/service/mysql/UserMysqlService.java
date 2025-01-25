package com.zmg.book.service.mysql;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmg.book.entity.User;

import java.util.List;


public interface UserMysqlService  extends IService<User>{

    public List<User> getAll();
    public User selectById(Long id);
    public List<User> getAllUsers();
}


