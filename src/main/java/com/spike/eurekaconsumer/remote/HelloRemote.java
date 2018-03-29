package com.spike.eurekaconsumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author spike.lin
 */
@FeignClient(value = "eureka-client", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {


    /**
     * hello
     * @param name
     * @return string
     */
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
