package com.spike.microservice.dubbo.business.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spike.microservice.dubbo.business.UserService;
import com.spike.microservice.dubbo.domain.Users;

public class TestConsumer {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] { "dubbo-consumer.xml" });
    context.start();

    DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
    String hello = demoService.sayHello("world"); // 执行远程方法
    System.out.println(hello); // 显示调用结果

    UserService userService = (UserService) context.getBean("userService");
    List<Users> users = userService.allUsers();
    System.out.println(users);

    context.close();
  }
}
