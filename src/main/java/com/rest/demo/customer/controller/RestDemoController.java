package com.rest.demo.customer.controller;

import com.rest.demo.customer.bean.CustomerBean;
import com.rest.demo.customer.service.CustomerDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Configuration
@RestController
public class RestDemoController {

@Autowired
private CustomerDaoService service;

    @GetMapping("/customers")
    public List<CustomerBean> getAllCustomers()
    {
        return service.ListAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public CustomerBean getCustomer(@PathVariable int id)
    {
        return service.GetCustomerByID(id);
    }

    @PostMapping("/customers")
    public ResponseEntity<Object> createCustomer(@RequestBody CustomerBean newcustomer)
    {
        CustomerBean cout= service.CreateCustomer(newcustomer);
        URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cout.getCustomerID()).toUri();
        return ResponseEntity.created(location).build();
    }

}
