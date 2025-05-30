package com.deliveries.deliveriesApi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.CustomerDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_customer", updatable = false, nullable = false)
    private UUID idCustomer;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf_cnpj", nullable = false)
    private String cpf_cnpj;

    @Column(name = "cellphone", nullable = false)
    private String cellphone;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address_id;

    public CustomerEntity(CustomerDto customer) {
        BeanUtils.copyProperties(customer, this);
    }

    public CustomerEntity() {

    }

    public UUID getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(UUID idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressEntity getAddress_id() {
        return address_id;
    }

    public void setAddress_id(AddressEntity address_id) {
        this.address_id = address_id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCustomer == null) ? 0 : idCustomer.hashCode());
        result = prime * result + ((cpf_cnpj == null) ? 0 : cpf_cnpj.hashCode());
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

        CustomerEntity other = (CustomerEntity) obj;

        if (idCustomer == null) {
            if (other.idCustomer != null) {
                return false;
            }
        } else if (!idCustomer.equals(other.idCustomer)) {
            return false;
        }

        if (cpf_cnpj == null) {
            if (other.cpf_cnpj != null) {
                return false;
            }
        } else if (!cpf_cnpj.equals(other.cpf_cnpj)) {
            return false;
        }

        return true;
    }
}
