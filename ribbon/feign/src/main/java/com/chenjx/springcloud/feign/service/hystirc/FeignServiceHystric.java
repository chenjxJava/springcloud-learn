package com.chenjx.springcloud.feign.service.hystirc;

import com.chenjx.springcloud.feign.service.FeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class FeignServiceHystric implements FeignService {

    @Override
    public String sayHi() {
        return "sorry, something error!";
    }
}
