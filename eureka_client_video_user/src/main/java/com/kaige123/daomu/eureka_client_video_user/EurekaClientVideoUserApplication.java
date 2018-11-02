package com.kaige123.daomu.eureka_client_video_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kaige123.daomu.eureka_client_video_user.DAO.Mapper")
public class EurekaClientVideoUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientVideoUserApplication.class, args);
    }
}
