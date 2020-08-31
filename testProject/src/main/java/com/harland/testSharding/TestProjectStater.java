package com.harland.testSharding;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.harland.**.dao")
public class TestProjectStater {
    public static void main(String[] args) {
        SpringApplication.run(TestProjectStater.class, args);
    }
}
