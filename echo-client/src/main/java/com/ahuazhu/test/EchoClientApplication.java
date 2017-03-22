package com.ahuazhu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EchoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchoClientApplication.class, args);
    }

}
