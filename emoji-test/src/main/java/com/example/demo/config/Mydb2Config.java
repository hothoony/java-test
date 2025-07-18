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
        basePackages = "com.example.demo.repository.mydb2",
        entityManagerFactoryRef = "mydb2EntityManagerFactory",
        transactionManagerRef = "mydb2TransactionManager"
)
public class Mydb2Config {

    @Bean(name = "mydb2DataSource")
    @ConfigurationProperties("mydb2.datasource")
    public DataSource mydb2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mydb2EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mydb2EntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mydb2DataSource") DataSource dataSource) {

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        properties.put("hibernate.format_sql", true);
        properties.put("hibernate.use_sql_comments", false);
        properties.put("hibernate.show_sql", false);

        return builder
                .dataSource(dataSource)
                .packages("com.example.demo.domain")
                .persistenceUnit("mydb2")
                .properties(properties)
                .build();
    }

    @Bean(name = "mydb2TransactionManager")
    public PlatformTransactionManager mydb2TransactionManager(
            @Qualifier("mydb2EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
