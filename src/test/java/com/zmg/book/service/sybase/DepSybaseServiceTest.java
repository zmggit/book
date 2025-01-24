package com.zmg.book.service.sybase;

import com.zmg.book.entity.Departments;
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
class DepSybaseServiceTest {

    @Autowired
    DataSource datasource;

    @Autowired
    private DepSybaseService depSysBaseSer;

    @Test
    void getAll() { //用户列表
        List<Departments> dep =  depSysBaseSer.getAll();
        System.out.println(dep);
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