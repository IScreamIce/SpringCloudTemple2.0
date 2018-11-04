package com.kaige123.daomu.eureka_client_video_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@MapperScan("com.kaige123.daomu.eureka_client_video_user.DAO.Mapper")
public class EurekaClientVideoUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientVideoUserApplication.class, args);
    }
}
