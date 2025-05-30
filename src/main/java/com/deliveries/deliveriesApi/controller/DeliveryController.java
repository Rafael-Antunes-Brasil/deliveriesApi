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

import com.deliveries.deliveriesApi.dto.DeliveryDto;
import com.deliveries.deliveriesApi.service.DeliveryService;

@RestController
@RequestMapping(value = "delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public List<DeliveryDto> listAll() {
        return deliveryService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody DeliveryDto deliveryDto) {
    }

    @PutMapping
    public DeliveryDto update(@RequestBody DeliveryDto deliveryDto) {
        return deliveryService.update(deliveryDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        deliveryService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/teste")
    public String root() {
        return "teste!";
    }
}
