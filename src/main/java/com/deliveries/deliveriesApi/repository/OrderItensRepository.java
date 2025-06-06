package com.deliveries.deliveriesApi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliveries.deliveriesApi.entity.OrderItensEntity;

public interface OrderItensRepository extends JpaRepository<OrderItensEntity, UUID> {

}
