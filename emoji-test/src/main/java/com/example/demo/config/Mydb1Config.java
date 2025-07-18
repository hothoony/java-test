package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
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
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        DataSource dataSource = dataSourceBuilder.build();
        System.out.println("dataSource = " + dataSource);
        return dataSource;
    }

    @Primary
    @Bean(name = "mydb1JpaProperties")
    @ConfigurationProperties(prefix = "mydb1.jpa")
    public JpaProperties mydb1JpaProperties() {
        JpaProperties jpaProperties = new JpaProperties();
        System.out.println("jpaProperties = " + jpaProperties);
        return jpaProperties;
    }

    @Primary
    @Bean(name = "mydb1EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mydb1EntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mydb1DataSource") DataSource dataSource,
            @Qualifier("mydb1JpaProperties") JpaProperties jpaProperties) {

        System.out.println("dataSource = " + dataSource);
        System.out.println("jpaProperties = " + jpaProperties);

        Map<String, String> vendorProperties = jpaProperties.getProperties();
        vendorProperties.put("hibernate.hbm2ddl.auto", "update");
//        vendorProperties.put("hibernate.hbm2ddl.auto", jpaProperties.getHibernate().getDdlAuto());
        System.out.println("vendorProperties = " + vendorProperties);

        return builder
                .dataSource(dataSource)
                .packages("com.example.demo.domain")
                .persistenceUnit("mydb1")
                .properties(vendorProperties)
                .build();
    }

    @Primary
    @Bean(name = "mydb1TransactionManager")
    public PlatformTransactionManager mydb1TransactionManager(
            @Qualifier("mydb1EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}