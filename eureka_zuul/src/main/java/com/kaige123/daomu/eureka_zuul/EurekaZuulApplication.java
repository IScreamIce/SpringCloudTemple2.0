package com.kaige123.daomu.eureka_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class EurekaZuulApplication {

    public static void main(String[] args) {
        org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration configuration;
        SpringApplication.run(EurekaZuulApplication.class, args);
    }
}
