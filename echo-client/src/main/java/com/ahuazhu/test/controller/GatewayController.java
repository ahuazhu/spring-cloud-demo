package com.ahuazhu.test.controller;

import com.ahuazhu.test.service.EchoServiceX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@RestController
public class GatewayController {

    @Autowired
    private EchoServiceX echoService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestBody String message) {

        return echoService.echo(message);
    }
}
