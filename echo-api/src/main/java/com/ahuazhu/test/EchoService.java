package com.ahuazhu.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
public interface EchoService {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    String echo(String msg);
}
