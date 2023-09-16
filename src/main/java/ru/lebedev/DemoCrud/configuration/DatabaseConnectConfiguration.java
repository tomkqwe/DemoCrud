package ru.lebedev.DemoCrud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConnectConfiguration {
    @Bean
    public DriverManagerDataSource connectToPostgresql() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/psy_help_database");
        driverManagerDataSource.setUsername("psy_admin");
        driverManagerDataSource.setPassword("psy_admin");
        return driverManagerDataSource;
    }
}
