package com.zmg.book.service.mysql;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

// 测试类
@Slf4j
@SpringBootTest
class UserMysqlServiceTest {
    @Autowired
    private UserMysqlService userMysqlSer;

    @Test
    void getAll() { //用户列表
        var us =  userMysqlSer.getAll();
        System.out.println(us);
        //foreach 循环
//        for (User value : us) { //循环数据
//            System.out.println(value);
//        }
//        // 普通for 循环
//        for (int i = 0; i < us.size(); i++) {
//            System.out.println(us.get(i));
//        }

    }

    @Test
    void selectById() { //获取用户详情
//        Long  x = 1L;
//        var  us =  UserSer.selectById(x);
//        System.out.println(String.format("%s 名称",us.getName()));
//        System.out.println(us.getId());
    }

    @Test
    public void findTotal(){

        Long total = userMysqlSer.count();
        System.out.println(total);
    }

}