package com.lp.lpspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.config
 * @Author: lp
 * @CreateTime: 2023-08-07  10:03
 * @Description: TODO
 * @Version: 1.0
 */
//@Configuration
//public class DataSourceConfig {
//    @Bean(name = "mysqlDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.mysql")
//    public DataSource mysqlDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "oracleDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.oracle")
//
//    public DataSource oracleDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//}

