package com.example.Center1.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
public class FeignConfig {
    @Bean
    public FeignClientBuilder feignClientBuilder(ApplicationContext applicationContext) {
        return new FeignClientBuilder(applicationContext);
    }
}
