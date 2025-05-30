package com.deliveries.deliveriesApi.dto;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.OrderEntity;
import com.deliveries.deliveriesApi.entity.OrderItensEntity;

public class OrderItensDto {

    private UUID idOrderItem;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private OrderEntity order;

    public OrderItensDto(OrderItensEntity orderItens) {
        BeanUtils.copyProperties(orderItens, this);
    }

    public OrderItensDto() {
    }

    public UUID getIdOrderItem() {
        return idOrderItem;
    }

    public void setIdOrderItem(UUID idOrderItem) {
        this.idOrderItem = idOrderItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }
}
