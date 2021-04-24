package com.example.mymall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.mymall.ware.dao")
@SpringBootApplication
public class MymallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallWareApplication.class, args);
    }

}
