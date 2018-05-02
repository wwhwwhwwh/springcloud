package com.ulovecode.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author JackZhu
 * @since 2018/05/02
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new FiveTimesRoundRule();
    }

}
