package com.example.restapi.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.example.restapi.usuarios.repository",
    entityManagerFactoryRef = "usuariosEntityManagerFactory"
)
public class UsuariosDataSourceConfig {

    @Primary
    @Bean(name = "usuariosDataSource")
    @ConfigurationProperties(prefix = "spring.jta.atomikos.datasource.usuarios")
    public DataSource usuariosDataSource() {
        return new AtomikosDataSourceBean();
    }

    @Primary
    @Bean(name = "usuariosEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean usuariosEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("usuariosDataSource") DataSource dataSource) {

        return builder
                .dataSource(dataSource)
                .jta(true)
                .packages("com.example.restapi.usuarios.model")
                .persistenceUnit("usuarios")
                .build();
    }
}