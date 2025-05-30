package com.deliveries.deliveriesApi.dto;

import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.entity.CarrierEntity;

public class CarrierDto {

    private UUID idCarrier;
    private String carrierName;
    private String cnpj;
    private String cellphone;
    private String telephone;
    private String email;

    public CarrierDto(CarrierEntity carrier) {
        BeanUtils.copyProperties(carrier, this);
    }

    public CarrierDto() {

    }

    public UUID getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(UUID idCarrier) {
        this.idCarrier = idCarrier;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
}
