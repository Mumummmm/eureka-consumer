package com.spike.eurekaconsumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author spike.lin
 */
@FeignClient("eureka-client")
public interface HelloRemote {


    /**
     * hello
     * @param name
     * @return string
     */
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
