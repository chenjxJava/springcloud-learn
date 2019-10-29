package com.chenjx.springcloud.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/provide/hi")
    public String sayHi() {
        return "hi, guy:"+ port;
    }
}
