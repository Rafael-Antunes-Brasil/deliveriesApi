package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.DeliveryStatusDto;
import com.deliveries.deliveriesApi.entity.DeliveryStatusEntity;
import com.deliveries.deliveriesApi.repository.DeliveryStatusRepository;

@Service
public class DeliveryStatusService {

    @Autowired
    private DeliveryStatusRepository deliveryStatusRepository;

    public List<DeliveryStatusDto> listAll() {
        List<DeliveryStatusEntity> DeliveryStatus = deliveryStatusRepository.findAll();
        return DeliveryStatus.stream().map(DeliveryStatusDto::new).toList();
    }

    public void insert(DeliveryStatusDto DeliveryStatus) {
        DeliveryStatusEntity deliveryStatusEntity = new DeliveryStatusEntity(DeliveryStatus);
        deliveryStatusRepository.save(deliveryStatusEntity);
    }

    public DeliveryStatusDto update(DeliveryStatusDto DeliveryStatus) {
        DeliveryStatusEntity deliveryStatusEntity = new DeliveryStatusEntity(DeliveryStatus);
        return new DeliveryStatusDto(deliveryStatusRepository.save(deliveryStatusEntity));
    }

    public void delete(UUID id) {
        DeliveryStatusEntity DeliveryStatus = deliveryStatusRepository.findById(id).get();
        deliveryStatusRepository.delete(DeliveryStatus);
    }

    public DeliveryStatusDto searchById(UUID id) {
        return new DeliveryStatusDto(deliveryStatusRepository.findById(id).get());
    }
}
