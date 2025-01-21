package com.zmg.book.service;

import com.zmg.book.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;


// 测试类
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceTest {


    @Autowired
    DataSource datasource;

    @Autowired
    private UserService UserSer;

    @Test
    void getAll() {
        List us =  UserSer.getAll();
       System.out.println(us);
    }

    @Test
    void selectById() {
        User us =  UserSer.selectById(1L);
        System.out.println(us);
    }
}