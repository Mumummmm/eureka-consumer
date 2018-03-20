package com.spike.eurekaconsumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author spike.lin
 */
@FeignClient("eureka-client")
public interface DcClient {

    /**
     * consumer
     * @return string
     */
    @GetMapping("/dc")
    String consumer();
}
