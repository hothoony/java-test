package com.example.demo.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.example.demo.repository.mydb1",
        entityManagerFactoryRef = "mydb1EntityManagerFactory",
        transactionManagerRef = "mydb1TransactionManager"
)
public class Mydb1Config {

    @Primary
    @Bean(name = "mydb1DataSource")
    @ConfigurationProperties("mydb1.datasource")
    public DataSource mydb1DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "mydb1EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mydb1EntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mydb1DataSource") DataSource dataSource) {

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        properties.put("hibernate.format_sql", true);
        properties.put("hibernate.use_sql_comments", false);
        properties.put("hibernate.show_sql", false);

        return builder
                .dataSource(dataSource)
                .packages("com.example.entity")
                .persistenceUnit("mydb1")
                .properties(properties)
                .build();
    }

    @Primary
    @Bean(name = "mydb1TransactionManager")
    public PlatformTransactionManager mydb1TransactionManager(
            @Qualifier("mydb1EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
