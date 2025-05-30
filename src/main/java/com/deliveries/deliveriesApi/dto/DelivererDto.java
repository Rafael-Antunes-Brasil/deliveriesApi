package com.deliveries.deliveriesApi.dto;

import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.AddressEntity;
import com.deliveries.deliveriesApi.entity.DelivererEntity;

public class DelivererDto {

    private UUID idDeliverer;
    private String delivererName;
    private String cpf_cnpj;
    private String cellphone;
    private String telephone;
    private String email;
    private AddressEntity address_id;
    private String plate;

    public DelivererDto(DelivererEntity deliverer) {
        BeanUtils.copyProperties(deliverer, this);
    }

    public DelivererDto() {

    }

    public UUID getIdDeliverer() {
        return idDeliverer;
    }

    public void setIdDeliverer(UUID idDeliverer) {
        this.idDeliverer = idDeliverer;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName;
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

    public AddressEntity getAddress() {
        return address_id;
    }

    public void setAddress(AddressEntity address_id) {
        this.address_id = address_id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
