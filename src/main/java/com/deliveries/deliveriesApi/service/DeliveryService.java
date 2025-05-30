package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.DeliveryDto;
import com.deliveries.deliveriesApi.entity.DeliveryEntity;
import com.deliveries.deliveriesApi.repository.DeliveryRepository;

@Service
public class DeliveryService {
    
    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<DeliveryDto> listAll() {
        List<DeliveryEntity> delivery = deliveryRepository.findAll();
        return delivery.stream().map(DeliveryDto::new).toList();
    }

    public void insert(DeliveryDto delivery) {
        DeliveryEntity deliveryEntity = new DeliveryEntity(delivery);
        deliveryRepository.save(deliveryEntity);
    }

    public DeliveryDto update(DeliveryDto delivery) {
        DeliveryEntity deliveryEntity = new DeliveryEntity(delivery);
        return new DeliveryDto(deliveryRepository.save(deliveryEntity));
    }

    public void delete(UUID id) {
        DeliveryEntity delivery = deliveryRepository.findById(id).get();
        deliveryRepository.delete(delivery);
    }

    public DeliveryDto searchById(UUID id) {
        return new DeliveryDto(deliveryRepository.findById(id).get());
    }
}
