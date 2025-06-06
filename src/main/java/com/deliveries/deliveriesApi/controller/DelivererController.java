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

import com.deliveries.deliveriesApi.dto.DelivererDto;
import com.deliveries.deliveriesApi.service.DelivererService;

@RestController
@RequestMapping(value = "deliverer")
public class DelivererController {

    @Autowired
    private DelivererService delivererService;

    @GetMapping
    public List<DelivererDto> listAll() {
        return delivererService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody DelivererDto delivererDto) {
    }

    @PutMapping
    public DelivererDto update(@RequestBody DelivererDto delivererDto) {
        return delivererService.update(delivererDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        delivererService.delete(id);
        return ResponseEntity.ok().build();
    }
}
