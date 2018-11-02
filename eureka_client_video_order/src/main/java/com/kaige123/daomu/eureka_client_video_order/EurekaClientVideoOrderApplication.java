package com.kaige123.daomu.eureka_client_video_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientVideoOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientVideoOrderApplication.class, args);
    }
}
