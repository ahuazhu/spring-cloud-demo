package com.ahuazhu.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@FeignClient("echo-service")
public interface EchoServiceX {

    @RequestMapping(method = RequestMethod.POST, value = "/hello")
    @ResponseBody
    String echo(@RequestBody String msg);
}
