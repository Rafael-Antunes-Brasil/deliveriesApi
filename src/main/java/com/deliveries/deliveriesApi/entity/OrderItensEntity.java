package com.deliveries.deliveriesApi.entity;

import java.math.BigDecimal;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.OrderItensDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_order_itens")
public class OrderItensEntity {

    @Id
    @GeneratedValue(generator = "order_item_id")
    @GenericGenerator(name = "order_item_id", strategy = "order_item_id")
    @Column(columnDefinition = "order_item_id", updatable = false, nullable = false)
    private UUID idOrderItem;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEntity order;

    public OrderItensEntity(OrderItensDto orderItens) {
        BeanUtils.copyProperties(orderItens, this);
    }

    public OrderItensEntity() {

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idOrderItem == null) ? 0 : idOrderItem.hashCode());
        result = prime * result + ((order == null) ? 0 : order.hashCode());
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
        OrderItensEntity other = (OrderItensEntity) obj;
        if (idOrderItem == null) {
            if (other.idOrderItem != null) {
                return false;
            }
        } else if (!idOrderItem.equals(other.idOrderItem)) {
            return false;
        }
        if (order == null) {
            if (other.order != null) {
                return false;
            }
        } else if (!order.equals(other.order)) {
            return false;
        }
        return true;
    }
}
