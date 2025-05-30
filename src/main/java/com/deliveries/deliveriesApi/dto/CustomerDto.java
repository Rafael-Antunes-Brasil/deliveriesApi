package com.deliveries.deliveriesApi.dto;

import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.AddressEntity;
import com.deliveries.deliveriesApi.entity.CustomerEntity;

public class CustomerDto {

    private UUID idCustomer;
    private String name;
    private String cpf_cnpj;
    private String cellphone;
    private String telephone;
    private String email;
    private AddressEntity address_id;

    public CustomerDto(CustomerEntity customer) {
        BeanUtils.copyProperties(name, this);
    }

    public CustomerDto() {
        
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
}
