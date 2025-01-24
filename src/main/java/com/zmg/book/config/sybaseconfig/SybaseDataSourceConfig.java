package com.zmg.book.config.sybaseconfig;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = SybaseDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "sybaseSqlSessionFactory")
public class SybaseDataSourceConfig {

    static final String PACKAGE = "com.zmg.book.mapper.sybasemapper";

    static final String MAPPER_LOCATION = "classpath*:mapper/sybasemapper/*.xml";

    @Bean(name = "sybaseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.sybase")
    public DataSource sybaseDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sybaseTransactionManager")
    public DataSourceTransactionManager sybaseTransactionManager() {
        return new DataSourceTransactionManager(sybaseDataSource());
    }

    @Bean(name = "sybaseSqlSessionFactory")
    public SqlSessionFactory sybaseSqlSessionFactory(@Qualifier("sybaseDataSource") DataSource sybaseDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(sybaseDataSource);
        sessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(SybaseDataSourceConfig.MAPPER_LOCATION)
        );
        return sessionFactory.getObject();
    }
}
