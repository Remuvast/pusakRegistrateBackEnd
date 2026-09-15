package com.example.restapi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.example.restapi.becas.repository",
    entityManagerFactoryRef = "becasEntityManagerFactory"
)
public class BecasDataSourceConfig {

    @Bean(name = "becasDataSource")
    @ConfigurationProperties(prefix = "spring.jta.atomikos.datasource.becas")
    public DataSource becasDataSource() {
        return new AtomikosDataSourceBean();
    }

    @Bean(name = "becasEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean becasEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("becasDataSource") DataSource dataSource) {

        return builder
                .dataSource(dataSource)
                .jta(true)
                .packages("com.example.restapi.becas.model")
                .persistenceUnit("becas")
                .build();
    }
}