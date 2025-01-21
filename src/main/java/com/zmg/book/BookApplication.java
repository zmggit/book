package com.zmg.book;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


// Mapper接口未被Spring管理
@MapperScan("com.zmg.book.mapper")
//主框架
@SpringBootApplication
public class BookApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    //用于打包 war包
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        //指定 @SpringBootApplication 所在类
        return application.sources(BookApplication.class);
    }

}
