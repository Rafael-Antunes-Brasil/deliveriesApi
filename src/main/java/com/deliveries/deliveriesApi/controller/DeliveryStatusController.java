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

import com.deliveries.deliveriesApi.dto.DeliveryStatusDto;
import com.deliveries.deliveriesApi.service.DeliveryStatusService;

@RestController
@RequestMapping(value = "deliveryStatus")
public class DeliveryStatusController {

    @Autowired
    private DeliveryStatusService deliveryStatusService;

    @GetMapping
    public List<DeliveryStatusDto> listAll() {
        return deliveryStatusService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody DeliveryStatusDto deliveryStatusDto) {
    }

    @PutMapping
    public DeliveryStatusDto update(@RequestBody DeliveryStatusDto deliveryStatusDto) {
        return deliveryStatusService.update(deliveryStatusDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        deliveryStatusService.delete(id);
        return ResponseEntity.ok().build();
    }
}
