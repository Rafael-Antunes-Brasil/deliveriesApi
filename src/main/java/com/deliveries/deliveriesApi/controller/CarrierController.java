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

import com.deliveries.deliveriesApi.dto.CarrierDto;
import com.deliveries.deliveriesApi.service.CarrierService;

@RestController
@RequestMapping(value = "carrier")
public class CarrierController {

    @Autowired
    private CarrierService carrierService;

    @GetMapping
    public List<CarrierDto> listAll() {
        return carrierService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody CarrierDto carrierDto) {

    }

    @PutMapping
    public CarrierDto update(@RequestBody CarrierDto carrierDto) {
        return carrierService.update(carrierDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        carrierService.delete(id);
        return ResponseEntity.ok().build();
    }
}
