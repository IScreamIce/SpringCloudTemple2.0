package com.kaige123.daomu.eureka_client_video_user.test;

import com.kaige123.daomu.eureka_client_video_user.FeignWord.test.testInvoke;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/UserTest")
    public String test() {
        System.out.println("USER test 请求成功");
        return "USER test 请求成功";
    }

    @Autowired
    testInvoke testInvokevar;

    //    feign转发远程调用服务
    @GetMapping("/FeginTest")
    public String FeginTest() {
        System.out.println("FeginTest 调用成功");
        return "FeginTest调起结果: " + testInvokevar.test();
    }

    @HystrixCommand(fallbackMethod = "ServerExceptionMsg")
    @GetMapping("/ErrorTest")
    public String ErrorTest() {
        throw new RuntimeException();
    }

    public String ServerExceptionMsg() {
        return "服务挂了,正在救急,请稍后...";
    }
}
