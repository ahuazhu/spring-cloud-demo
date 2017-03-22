package com.ahuazhu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@SpringBootApplication
@EnableEurekaClient
public class EchoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchoServiceApplication.class, args);
    }
}
