package com.zmg.book.config.sybaseconfig;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import com.zmg.book.config.oracleconfig.OracleDataSourceConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = SybaseDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "sybaseSqlSessionFactory")
public class SybaseDataSourceConfig {

    static final String PACKAGE = "com.zmg.book.mapper.sybasemapper";
    static final String MAPPER_LOCATION = "classpath*:mapper/sybasemapper/*.xml";

    @Primary
    @Bean(name = "sybaseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.sybase")
    public HikariDataSource sybaseDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "sybaseSqlSessionFactory")
    public MybatisSqlSessionFactoryBean sybaseSqlSessionFactory(@Qualifier("sybaseDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(SybaseDataSourceConfig.MAPPER_LOCATION));
        return bean;
    }
}
