package com.deliveries.deliveriesApi.entity;

import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.DeliveryDto;
import com.deliveries.deliveriesApi.enums.StatusEntrega;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_delivery")
public class DeliveryEntity {

    @Id
    @GeneratedValue(generator = "delivery_id")
    @GenericGenerator(name = "delivery_id", strategy = "delivery_id")
    @Column(columnDefinition = "delivery_id", updatable = false, nullable = false)
    private UUID idDelivery;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_entrega")
    private StatusEntrega status;

    @Column(name = "date_create")
    private Date dateCreate;

    @Column(name = "sending_data")
    private Date sendingData;

    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "tracking_code")
    private Integer trackingCode;

    @Column(name = "transport_id")
    private Integer transportId;

    public DeliveryEntity(DeliveryDto deliveryDto) {
        BeanUtils.copyProperties(deliveryDto, this);
    }

    public DeliveryEntity() {

    }

    public UUID getId() {
        return idDelivery;
    }

    public void setId(UUID id) {
        this.idDelivery = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idDelivery == null) ? 0 : idDelivery.hashCode());
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
        result = prime * result + ((transportId == null) ? 0 : transportId.hashCode());
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
        DeliveryEntity other = (DeliveryEntity) obj;
        if (idDelivery == null) {
            if (other.idDelivery != null) {
                return false;
            }
        } else if (!idDelivery.equals(other.idDelivery)) {
            return false;
        }
        if (orderId == null) {
            if (other.orderId != null) {
                return false;
            }
        } else if (!orderId.equals(other.orderId)) {
            return false;
        }
        if (transportId == null) {
            if (other.transportId != null) {
                return false;
            }
        } else if (!transportId.equals(other.transportId)) {
            return false;
        }
        return true;
    }
}


/*
 * 
Entrega:
ID da Entrega
ID do Pedido (referência à entidade de Pedido)
ID da Transportadora (referência à entidade de Transportadora)
ID do Entregador (referência à entidade de Entregador)
Status da Entrega (referência à entidade de Status da Entrega)
Data e Hora da Entrega (prevista e/ou real)
Código de Rastreamento (se aplicável)
Observações sobre a Entrega
 */
