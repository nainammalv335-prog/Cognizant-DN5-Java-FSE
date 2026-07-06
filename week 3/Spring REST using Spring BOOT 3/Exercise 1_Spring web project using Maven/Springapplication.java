package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestDemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot 3 REST API";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 3 REST!";
    }
}
