package com.deliveries.deliveriesApi.entity;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.DeliveryStatusDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_delivery_status")
public class DeliveryStatusEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "id_status", updatable = false, nullable = false)
    private UUID idStatus;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public DeliveryStatusEntity(DeliveryStatusDto statusDto) {
        BeanUtils.copyProperties(statusDto, this);
    }

    public DeliveryStatusEntity() {

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idStatus == null) ? 0 : idStatus.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DeliveryStatusEntity other = (DeliveryStatusEntity) obj;
        if (idStatus == null) {
            if (other.idStatus != null) {
                return false;
            }
        } else if (!idStatus.equals(other.idStatus)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}
