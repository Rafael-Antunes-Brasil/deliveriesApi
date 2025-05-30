package com.deliveries.deliveriesApi.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.OrderDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_order")
public class OrderEntity {

    @Id
    @GeneratedValue(generator = "order_id")
    @GenericGenerator(name = "order_id", strategy = "order_id")
    @Column(columnDefinition = "order_id", updatable = false, nullable = false)
    private UUID idOrder;

    @Column(name = "date_create", nullable = false)
    private Date dateCreate;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column(name = "order_total", nullable = false)
    private Number orderTotal;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address_id;

    @OneToMany(mappedBy = "order_itens")
    private List<OrderItensEntity> order_itens;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer_id;

    public OrderEntity(OrderDto order) {
        BeanUtils.copyProperties(order, this);
    }

    public OrderEntity() {

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idOrder == null) ? 0 : idOrder.hashCode());
        result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
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

        OrderEntity other = (OrderEntity) obj;

        if (idOrder == null) {
            if (other.idOrder != null) {
                return false;
            }
        } else if (!idOrder.equals(other.idOrder)) {
            return false;
        }

        if (customer_id == null) {
            if (other.customer_id != null) {
                return false;
            }
        } else if (!customer_id.equals(other.customer_id)) {
            return false;
        }

        return true;
    }
}

/*
 * Pedido:
ID do Pedido
Data do Pedido
Itens do Pedido (com referência à entidade de Produtos)
Cliente (com referência à entidade de Cliente)
Forma de Pagamento
Total do Pedido
Endereço de Entrega (com referência à entidade de Endereço)
 */
