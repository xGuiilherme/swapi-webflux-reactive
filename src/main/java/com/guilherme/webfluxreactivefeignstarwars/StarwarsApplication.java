package com.guilherme.webfluxreactivefeignstarwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@EnableReactiveFeignClients
@SpringBootApplication
public class StarwarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarwarsApplication.class, args);
    }
}
