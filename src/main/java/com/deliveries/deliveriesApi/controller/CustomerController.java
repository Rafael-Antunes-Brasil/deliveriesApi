package com.deliveries.deliveriesApi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveries.deliveriesApi.dto.CustomerDto;
import com.deliveries.deliveriesApi.service.CustomerService;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerDto> listAll() {
        return customerService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody CustomerDto customerDto) {
    }

    @PutMapping
    public CustomerDto update(@RequestBody CustomerDto customerDto) {
        return customerService.update(customerDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        customerService.delete(id);
        return ResponseEntity.ok().build();
    }

}
