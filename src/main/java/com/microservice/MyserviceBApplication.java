package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservice.myserviceB.register.ConsulRegisterListener;

@SpringBootApplication
public class MyserviceBApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyserviceBApplication.class);
        application.addListeners(new ConsulRegisterListener());
        application.run(args);
    }
}
