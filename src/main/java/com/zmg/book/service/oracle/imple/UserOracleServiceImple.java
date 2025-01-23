package com.zmg.book.service.oracle.imple;


import com.zmg.book.entity.Student;
import com.zmg.book.mapper.oraclemapper.UserOracleMapper;
import com.zmg.book.service.oracle.UserOracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("oracleUserService")
public class UserOracleServiceImple implements UserOracleService {
    @Autowired(required = false)
    private UserOracleMapper userOracleMapper;
    @Override
    public List<Student> getAll() {
        return userOracleMapper.getAll();
    }

    @Override
    public Student selectById(Long id) {
        return userOracleMapper.selectById(id);
    }
}
