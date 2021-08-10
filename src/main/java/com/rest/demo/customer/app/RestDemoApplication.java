package com.rest.demo.customer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rest.demo.customer")
public class RestDemoApplication extends SpringBootServletInitializer {
 //   public class RestDemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(RestDemoApplication.class,args);
    }

}
