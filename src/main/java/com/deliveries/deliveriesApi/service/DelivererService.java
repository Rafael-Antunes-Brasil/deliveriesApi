package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.DelivererDto;
import com.deliveries.deliveriesApi.entity.DelivererEntity;
import com.deliveries.deliveriesApi.repository.DelivererRepository;

@Service
public class DelivererService {

    @Autowired
    private DelivererRepository delivererRepository;

    public List<DelivererDto> listAll() {
        List<DelivererEntity> deliverer = delivererRepository.findAll();
        return deliverer.stream().map(DelivererDto::new).toList();
    }

    public void insert(DelivererDto deliverer) {
        DelivererEntity delivererEntity = new DelivererEntity(deliverer);
        delivererRepository.save(delivererEntity);
    }

    public DelivererDto update(DelivererDto deliverer) {
        DelivererEntity delivererEntity = new DelivererEntity(deliverer);
        return new DelivererDto(delivererRepository.save(delivererEntity));
    }

    public void delete(UUID id) {
        DelivererEntity deliverer = delivererRepository.findById(id).get();
        delivererRepository.delete(deliverer);
    }

    public DelivererDto searchById(UUID id) {
        return new DelivererDto(delivererRepository.findById(id).get());
    }
}
