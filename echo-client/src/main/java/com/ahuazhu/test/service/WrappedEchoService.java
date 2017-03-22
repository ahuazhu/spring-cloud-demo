package com.ahuazhu.test.service;

import com.ahuazhu.test.EchoService;

/**
 * Created by zhengwenzhu on 2017/3/22.
 */
public class WrappedEchoService implements EchoService {

    @Override
    public String echo(String msg) {
        return null;
    }
}
