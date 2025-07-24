package com.example.restapi.config;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.example.restapi.becas.repository",
    entityManagerFactoryRef = "becasEntityManagerFactory",
    transactionManagerRef = "becasTransactionManager"
)
public class BecasDataSourceConfig {

    @Bean(name = "becasDataSource")
    @ConfigurationProperties(prefix = "second.datasource")
    public DataSource becasDataSource() {
        return DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "becasEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean becasEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("becasDataSource") DataSource dataSource) {

        return builder
                .dataSource(dataSource)
                .packages("com.example.restapi.becas.model")
                .persistenceUnit("becas")
                .build();
    }

    @Bean(name = "becasTransactionManager")
    public PlatformTransactionManager becasTransactionManager(
            @Qualifier("becasEntityManagerFactory") EntityManagerFactory becasEntityManagerFactory) {
        return new JpaTransactionManager(becasEntityManagerFactory);
    }
}
