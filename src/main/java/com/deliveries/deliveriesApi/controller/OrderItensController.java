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

import com.deliveries.deliveriesApi.dto.OrderItensDto;
import com.deliveries.deliveriesApi.service.OrderItensService;

@RestController
@RequestMapping(value = "orderItens")
public class OrderItensController {

    @Autowired
    private OrderItensService orderItensService;

    @GetMapping
    public List<OrderItensDto> listAll() {
        return orderItensService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody OrderItensDto orderItensDto) {
    }

    @PutMapping
    public OrderItensDto update(@RequestBody OrderItensDto orderItensDto) {
        return orderItensService.update(orderItensDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        orderItensService.delete(id);
        return ResponseEntity.ok().build();
    }

}
