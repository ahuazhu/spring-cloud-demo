package com.ahuazhu.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@FeignClient("echo-service")
public interface EchoService {

    @RequestMapping(method = RequestMethod.GET, value = "/world")
    @ResponseBody
    String echo(@RequestParam("msg") String msg);
}
