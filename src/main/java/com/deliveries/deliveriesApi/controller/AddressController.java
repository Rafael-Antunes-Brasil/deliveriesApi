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

import com.deliveries.deliveriesApi.dto.AddressDto;
import com.deliveries.deliveriesApi.service.AddressService;

@RestController
@RequestMapping(value = "address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<AddressDto> listAll() {
        return addressService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody AddressDto addressDto) {

    }

    @PutMapping
    public AddressDto update(@RequestBody AddressDto addressDto) {
        return addressService.update(addressDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        addressService.delete(id);
        return ResponseEntity.ok().build();
    }
}
