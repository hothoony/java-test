package com.example.demo.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
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

    @Bean(name = "mydb2JpaProperties")
    @ConfigurationProperties(prefix = "mydb2.jpa")
    public JpaProperties mydb2JpaProperties() {
        return new JpaProperties();
    }

    @Bean(name = "mydb2HibernateProperties")
    @ConfigurationProperties(prefix = "mydb2.jpa.hibernate")
    public HibernateProperties mydb2HibernateProperties() {
        return new HibernateProperties();
    }

    @Bean(name = "mydb2EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mydb2EntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mydb2DataSource") DataSource dataSource,
            @Qualifier("mydb2JpaProperties") JpaProperties jpaProperties,
            @Qualifier("mydb2HibernateProperties") HibernateProperties hibernateProperties) {

        Map<String, Object> vendorProperties = hibernateProperties.determineHibernateProperties(
                jpaProperties.getProperties(), new HibernateSettings());

        return builder
                .dataSource(dataSource)
                .packages("com.example.demo.domain")
                .persistenceUnit("mydb2")
                .properties(vendorProperties)
                .build();
    }

    @Bean(name = "mydb2TransactionManager")
    public PlatformTransactionManager mydb2TransactionManager(
            @Qualifier("mydb2EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}