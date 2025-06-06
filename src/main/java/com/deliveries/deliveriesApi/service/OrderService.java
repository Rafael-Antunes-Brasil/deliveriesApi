package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.OrderDto;
import com.deliveries.deliveriesApi.entity.OrderEntity;
import com.deliveries.deliveriesApi.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDto> listAll() {
        List<OrderEntity> order = orderRepository.findAll();
        return order.stream().map(OrderDto::new).toList();
    }

    public void insert(OrderDto order) {
        OrderEntity orderEntity = new OrderEntity(order);
        orderRepository.save(orderEntity);
    }

    public OrderDto update(OrderDto order) {
        OrderEntity orderEntity = new OrderEntity(order);
        return new OrderDto(orderRepository.save(orderEntity));
    }

    public void delete(UUID id) {
        OrderEntity order = orderRepository.findById(id).get();
        orderRepository.delete(order);
    }

    public OrderDto searchById(UUID id) {
        return new OrderDto(orderRepository.findById(id).get());
    }
}
