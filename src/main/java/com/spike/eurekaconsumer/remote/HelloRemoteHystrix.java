package com.spike.eurekaconsumer.remote;

import org.springframework.stereotype.Component;

/**
 * @author spike.lin
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(String name) {
        return "hello" + name + ", this message send failed";
    }
}
