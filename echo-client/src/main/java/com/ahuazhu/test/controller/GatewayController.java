package com.ahuazhu.test.controller;

import com.ahuazhu.test.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@RestController
public class GatewayController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test(@RequestParam("msg") String msg) {

        return "hello " + echoService.echo(msg);
    }
}
