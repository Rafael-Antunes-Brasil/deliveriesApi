package com.deliveries.deliveriesApi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveries.deliveriesApi.dto.AddressDto;
import com.deliveries.deliveriesApi.entity.AddressEntity;
import com.deliveries.deliveriesApi.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<AddressDto> listAll() {
        List<AddressEntity> address = addressRepository.findAll();
        return address.stream().map(AddressDto::new).toList();
    }

    public void insert(AddressDto address) {
        AddressEntity addressEntity = new AddressEntity(address);
        addressRepository.save(addressEntity);
    }

    public AddressDto update(AddressDto address) {
        AddressEntity addressEntity = new AddressEntity(address);
        return new AddressDto(addressRepository.save(addressEntity));
    }

    public void delete(UUID id) {
        AddressEntity address = addressRepository.findById(id).get();
        addressRepository.delete(address);
    }

    public AddressDto searchById(UUID id) {
        return new AddressDto(addressRepository.findById(id).get());
    }
}
