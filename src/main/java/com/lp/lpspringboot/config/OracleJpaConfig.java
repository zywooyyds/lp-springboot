package com.lp.lpspringboot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Collections;

/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.config
 * @Author: lp
 * @CreateTime: 2023-08-07  10:15
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "com.lp.lpspringboot.oracle.repository",
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager"
)
public class OracleJpaConfig {
    @Bean(name = "oracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oracleEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                             @Qualifier("oracleDataSource") DataSource dataSource,
                                                                             @Value("${spring.jpa.oracle.database-platform}") String databasePlatform) {
        return builder.dataSource(dataSource)
                .packages("com.lp.lpspringboot.oracle.model")
                .persistenceUnit("oracle")
                .properties(Collections.singletonMap("hibernate.dialect", databasePlatform))
                .build();
    }

    @Bean(name = "oracleTransactionManager")
    public PlatformTransactionManager oracleTransactionManager(
            @Qualifier("oracleEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}

