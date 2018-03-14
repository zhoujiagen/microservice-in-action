package com.spike.microservice.dubbo.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:dubbo-consumer.xml")
public class DubboConfiguration {

}
