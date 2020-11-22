package com.vvc.case_mybatis_plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vvc.case_mybatis_plus.mapper")
public class CaseMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseMybatisPlusApplication.class, args);
    }

}
