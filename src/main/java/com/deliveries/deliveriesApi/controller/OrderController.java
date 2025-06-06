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

import com.deliveries.deliveriesApi.dto.OrderDto;
import com.deliveries.deliveriesApi.service.OrderService;

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderDto> listAll() {
        return orderService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody OrderDto orderDto) {
    }

    @PutMapping
    public OrderDto update(@RequestBody OrderDto orderDto) {
        return orderService.update(orderDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(UUID id) {
        orderService.delete(id);
        return ResponseEntity.ok().build();
    }
}
