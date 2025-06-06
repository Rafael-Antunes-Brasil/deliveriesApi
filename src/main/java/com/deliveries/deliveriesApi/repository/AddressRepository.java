package com.deliveries.deliveriesApi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliveries.deliveriesApi.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, UUID> {

}
