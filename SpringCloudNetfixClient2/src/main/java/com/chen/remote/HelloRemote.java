package com.chen.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cvter on 2017/6/29.
 */
@FeignClient(name= "spring-cloud-eureka-client",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @PostMapping(value = "/hello")
    public String hello(@RequestParam(value = "name")  String name);
}
