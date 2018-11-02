package com.kaige123.daomu.eureka_client_video_user.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/test")
    public String test() {
        System.out.println("请求成功");
        return "请求成功";
    }
}
