package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.CustomerDto;
import com.deliveries.deliveriesApi.entity.CustomerEntity;
import com.deliveries.deliveriesApi.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDto> listAll() {
        List<CustomerEntity> customer = customerRepository.findAll();
        return customer.stream().map(CustomerDto::new).toList();
    }

    public void insert(CustomerDto customer) {
        CustomerEntity customerEntity = new CustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

    public CustomerDto update(CustomerDto customer) {
        CustomerEntity customerEntity = new CustomerEntity(customer);
        return new CustomerDto(customerRepository.save(customerEntity));
    }

    public void delete(UUID id) {
        CustomerEntity customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
    }

    public CustomerDto searchById(UUID id) {
        return new CustomerDto(customerRepository.findById(id).get());
    }
}
