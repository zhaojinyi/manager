package com.csz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan("com.csz.mapper")
@SpringBootApplication
public class ManagerConsoleApp
{
    public static void main(String[] args) {
        SpringApplication.run(ManagerConsoleApp.class, args);
    }
}
