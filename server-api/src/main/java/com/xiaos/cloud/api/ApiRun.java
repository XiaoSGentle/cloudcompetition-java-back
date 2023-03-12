package com.xiaos.cloud.api;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.xiaos.cloud")
@MapperScan(basePackages = "com.xiaos.cloud.db.mapper")
@EnableSwagger2
public class ApiRun {
    public static void main(String[] args) {
        SpringApplication.run(ApiRun.class,args);
    }
}
