package com.ww.config;

import com.ww.service.BqwgService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public BqwgService bqwgService(){
        return new BqwgService();
    }
}
