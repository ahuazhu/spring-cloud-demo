package com.ahuazhu.test.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@RestController
public class EchoServiceImpl {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String echo(@RequestParam("msg") String msg) {
        return "world: " + msg;
    }
}
