package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.OrderItensDto;
import com.deliveries.deliveriesApi.entity.OrderItensEntity;
import com.deliveries.deliveriesApi.repository.OrderItensRepository;

@Service
public class OrderItensService {

    @Autowired
    private OrderItensRepository orderItensRepository;

    public List<OrderItensDto> listAll() {
        List<OrderItensEntity> orderItens = orderItensRepository.findAll();
        return orderItens.stream().map(OrderItensDto::new).toList();
    }

    public void insert(OrderItensDto orderItens) {
        OrderItensEntity orderItensEntity = new OrderItensEntity(orderItens);
        orderItensRepository.save(orderItensEntity);
    }

    public OrderItensDto update(OrderItensDto orderItens) {
        OrderItensEntity orderItensEntity = new OrderItensEntity(orderItens);
        return new OrderItensDto(orderItensRepository.save(orderItensEntity));
    }

    public void delete(UUID id) {
        OrderItensEntity orderItens = orderItensRepository.findById(id).get();
        orderItensRepository.delete(orderItens);
    }

    public OrderItensDto searchById(UUID id) {
        return new OrderItensDto(orderItensRepository.findById(id).get());
    }
}
