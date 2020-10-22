package com.example.vkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class VkdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VkdemoApplication.class, args);
    }

    @RequestMapping("/home")
    String getMessage() {
        return "Welcome to the Config Server!";
    }
}
