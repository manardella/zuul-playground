package com.example.zuulplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulPlaygroundApplication.class, args);
    }
}
