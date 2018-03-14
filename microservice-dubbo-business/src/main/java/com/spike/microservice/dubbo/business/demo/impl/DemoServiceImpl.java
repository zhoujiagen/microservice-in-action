package com.spike.microservice.dubbo.business.demo.impl;

import com.spike.microservice.dubbo.business.demo.DemoService;

public class DemoServiceImpl implements DemoService {
  public String sayHello(String name) {
    return "Hello " + name;
  }
}