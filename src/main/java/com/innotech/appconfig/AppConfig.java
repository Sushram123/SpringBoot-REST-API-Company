package com.innotech.appconfig;



import com.innotech.model.Company;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Map<Long, Company> companyMap() {
        // Initialize an empty map or load data from somewhere
        return new HashMap<>();
    }
}
