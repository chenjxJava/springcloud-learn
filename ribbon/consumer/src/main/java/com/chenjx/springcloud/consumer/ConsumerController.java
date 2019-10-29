package com.chenjx.springcloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 一对一，单独http协议，调用
     * @return
     */
    @RequestMapping("/consume/demo")
    public String sayHi() {
        return restTemplate.getForObject("http://provider/provide/hi", String.class);
    }

    /**
     * ribbion负载均衡
     * @return
     */
    @RequestMapping("/consume/getInterfaceInfo")
    public void sayHiPuls() {
        ServiceInstance provider = loadBalancerClient.choose("provider");
        System.out.println(provider.getPort());
    }
}
