package com.ulovecode.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author JackZhu
 * @since 2018/05/02
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix 实现的一套工具 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
