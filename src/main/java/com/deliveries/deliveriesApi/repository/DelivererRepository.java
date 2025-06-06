package com.deliveries.deliveriesApi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliveries.deliveriesApi.entity.DelivererEntity;

public interface DelivererRepository extends JpaRepository<DelivererEntity, UUID> {

}
