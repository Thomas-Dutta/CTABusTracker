package com.example.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by thomasdutta on 1/12/17.
 */

@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
