package com.nie.pojo;


import org.springframework.stereotype.Component;

@Component
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    public String name="聂";
}
