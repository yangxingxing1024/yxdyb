package com.example.dyb;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dyb.register.dao")
@SpringBootApplication
public class DybApplication {

    public static void main(String[] args) {
        SpringApplication.run(DybApplication.class, args);
    }

}
