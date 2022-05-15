package com.nie.config;


import com.nie.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nie.pojo")
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
