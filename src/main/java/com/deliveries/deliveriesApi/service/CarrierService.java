package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.CarrierDto;
import com.deliveries.deliveriesApi.entity.CarrierEntity;
import com.deliveries.deliveriesApi.repository.CarrierRepository;

@Service
public class CarrierService {

    @Autowired
    private CarrierRepository carrierRepository;

    public List<CarrierDto> listAll() {
        List<CarrierEntity> carrier = carrierRepository.findAll();
        return carrier.stream().map(CarrierDto::new).toList();
    }

    public void insert(CarrierDto carrier) {
        CarrierEntity carrierEntity = new CarrierEntity(carrier);
        carrierRepository.save(carrierEntity);
    }

    public CarrierDto update(CarrierDto carrier) {
        CarrierEntity carrierEntity = new CarrierEntity(carrier);
        return new CarrierDto(carrierRepository.save(carrierEntity));
    }

    public void delete(UUID id) {
        CarrierEntity carrier = carrierRepository.findById(id).get();
        carrierRepository.delete(carrier);
    }

    public CarrierDto searchById(UUID id) {
        return new CarrierDto(carrierRepository.findById(id).get());
    }
}
