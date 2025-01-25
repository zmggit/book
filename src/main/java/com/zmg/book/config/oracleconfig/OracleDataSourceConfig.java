package com.zmg.book.config.oracleconfig;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = OracleDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "oracleSqlSessionFactory")
public class OracleDataSourceConfig {

    static final String PACKAGE = "com.zmg.book.mapper.oraclemapper";
    static final String MAPPER_LOCATION = "classpath*:mapper/oraclemapper/*.xml";

    @Primary
    @Bean(name = "oracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public HikariDataSource oracleDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "oracleSqlSessionFactory")
    public MybatisSqlSessionFactoryBean oracleSqlSessionFactory(@Qualifier("oracleDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(OracleDataSourceConfig.MAPPER_LOCATION));
        return bean;
    }


}
