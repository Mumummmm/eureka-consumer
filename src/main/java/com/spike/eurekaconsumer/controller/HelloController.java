package com.spike.eurekaconsumer.controller;

import com.spike.eurekaconsumer.remote.HelloRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author spike.lin
 */
@RestController
public class HelloController {

    @Resource
    private HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
