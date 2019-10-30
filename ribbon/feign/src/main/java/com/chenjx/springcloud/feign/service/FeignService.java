package com.chenjx.springcloud.feign.service;

import com.chenjx.springcloud.feign.service.hystirc.FeignServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider", fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping(value = "/provide/hi", method = RequestMethod.GET)
    String sayHi();
}
