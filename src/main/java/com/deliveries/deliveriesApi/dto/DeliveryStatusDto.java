package com.deliveries.deliveriesApi.dto;

import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.DeliveryStatusEntity;

public class DeliveryStatusDto {

    private UUID idStatus;
    private String name;
    private String description;

    public DeliveryStatusDto(DeliveryStatusEntity status) {
        BeanUtils.copyProperties(status, this);
    }

    public DeliveryStatusDto() {

    }

    public UUID getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(UUID idStatus) {
        this.idStatus = idStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
