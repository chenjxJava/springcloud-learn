package com.chenjx.springcloud.feign.controller;

import com.chenjx.springcloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String get(/*@RequestParam String name*/) {
        return feignService.sayHi();
    }
}
