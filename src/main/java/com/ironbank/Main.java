package com.ironbank;


import com.ironbank.model.ProphetProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }
}

