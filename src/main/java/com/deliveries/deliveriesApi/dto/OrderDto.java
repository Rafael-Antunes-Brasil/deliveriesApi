package com.deliveries.deliveriesApi.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.AddressEntity;
import com.deliveries.deliveriesApi.entity.CustomerEntity;
import com.deliveries.deliveriesApi.entity.OrderEntity;
import com.deliveries.deliveriesApi.entity.OrderItensEntity;

public class OrderDto {

    private UUID idOrder;
    private Date dateCreate;
    private String paymentMethod;
    private Number orderTotal;
    private AddressEntity address_id;
    private List<OrderItensEntity> order_itens;
    private CustomerEntity customer_id;

    public OrderDto(OrderEntity order) {
        BeanUtils.copyProperties(order, this);
    }

    public OrderDto() {

    }

    public UUID getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(UUID idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Number getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Number orderTotal) {
        this.orderTotal = orderTotal;
    }

    public AddressEntity getAddress_id() {
        return address_id;
    }

    public void setAddress_id(AddressEntity address_id) {
        this.address_id = address_id;
    }

    public List<OrderItensEntity> getOrder_itens() {
        return order_itens;
    }

    public void setOrder_itens(List<OrderItensEntity> order_itens) {
        this.order_itens = order_itens;
    }

    public CustomerEntity getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(CustomerEntity customer_id) {
        this.customer_id = customer_id;
    }
}
