# SpringCloudTemple2.0
增加了Fegin转发访问，Hystrix容错机制(断路器)

在eureka_client_video_user包中
1：增加Hystrix断路器，异常拦截。执行我们fallbackMethod指定的方法
2：增加Feign远程调用其他服务。方法与远程服务一致，调用获得运行结果
