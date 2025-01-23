package com.zmg.book.service.oracle;

import com.zmg.book.entity.Student;
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
class UserOracleServiceTest {

    @Autowired
    DataSource datasource;

    @Autowired
    private UserOracleService UserOracleSer;

    @Test
    void getAll() { //用户列表
        List<Student> stu =  UserOracleSer.getAll();
        System.out.println(stu);
        //foreach 循环
//        for (Student value : us) { //循环数据
//            System.out.println(value);
//        }
//        // 普通for 循环
//        for (int i = 0; i < us.size(); i++) {
//            System.out.println(us.get(i));
//        }

    }
    @Test
    void selectById() {
    }
}