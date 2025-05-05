package com.example.restapi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties; // 👈 ESTE IMPORT FALTABA
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.example.restapi.usuarios.repository",
    entityManagerFactoryRef = "usuariosEntityManagerFactory",
    transactionManagerRef = "usuariosTransactionManager"
)
public class UsuariosDataSourceConfig {


    @Primary
    @Bean(name = "usuariosDataSource")
    @ConfigurationProperties(prefix = "spring.datasource") // 👈 Este prefix debe coincidir con tu application.properties
    public DataSource usuariosDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "usuariosEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean usuariosEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("usuariosDataSource") DataSource dataSource) {

        return builder
                .dataSource(dataSource)
                .packages("com.example.restapi.usuarios.model") // 👈 Modelos para esta base
                .persistenceUnit("usuarios")
                .build();
    }

    @Primary
    @Bean(name = "usuariosTransactionManager")
    public PlatformTransactionManager usuariosTransactionManager(
            @Qualifier("usuariosEntityManagerFactory") EntityManagerFactory usuariosEntityManagerFactory) {
        return new JpaTransactionManager(usuariosEntityManagerFactory);
    }
}
