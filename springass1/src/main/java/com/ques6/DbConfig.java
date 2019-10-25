package com.ques6;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.ques6")
@PropertySource("classpath:com/ques6/dbConfig.properties")
public class DbConfig {


}
