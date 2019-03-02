package com.example.apigeedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class ApigeedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigeedemoApplication.class, args);
    }

}

