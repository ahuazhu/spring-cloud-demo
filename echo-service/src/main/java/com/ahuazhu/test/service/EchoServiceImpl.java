package com.ahuazhu.test.service;

import com.ahuazhu.test.EchoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
@RestController
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(@RequestBody String msg) {
        return "Hello, " + msg;
    }
}
