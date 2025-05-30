package com.deliveries.deliveriesApi.dto;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.DeliveryEntity;
import com.deliveries.deliveriesApi.enums.StatusEntrega;

public class DeliveryDto {

    private UUID id;
    private Integer pedidoId;
    private StatusEntrega status;
    private Date dateCreate;
    private Date sendingData;
    private Date deliveryDate;
    private Integer trackingCode;
    private Integer transportId;

    public DeliveryDto(DeliveryEntity delivery) {
        BeanUtils.copyProperties(delivery, this);
    }

    public DeliveryDto() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public StatusEntrega getStatus() {
        return status;
    }

    public void setStatus(StatusEntrega status) {
        this.status = status;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getSendingData() {
        return sendingData;
    }

    public void setSendingData(Date sendingData) {
        this.sendingData = sendingData;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Integer getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(Integer trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }
}
