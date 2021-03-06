package com.jaisoft.tracing;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class ZipkinController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping(value = "/zipkin4")
    public String zipkinService1() {
        LOG.info("Inside zipkinService 4..");
        return "Hi...";
    }
}
