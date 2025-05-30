package com.deliveries.deliveriesApi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.CarrierDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_carrier")
public class CarrierEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_carrier", updatable = false, nullable = false)
    private UUID idCarrier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @Column(name = "cellphone", nullable = false)
    private String cellphone;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email", nullable = false)
    private String email;

    public UUID getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(UUID idCarrier) {
        this.idCarrier = idCarrier;
    }

    public String getCarrierName() {
        return name;
    }

    public void setCarrierName(String carrierName) {
        this.name = carrierName;
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

    public CarrierEntity(CarrierDto carrierDto) {
        BeanUtils.copyProperties(carrierDto, this);
    }

    public CarrierEntity() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCarrier == null) ? 0 : idCarrier.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
        CarrierEntity other = (CarrierEntity) obj;
        if (idCarrier == null) {
            if (other.idCarrier != null) {
                return false;
            }
        } else if (!idCarrier.equals(other.idCarrier)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (cnpj == null) {
            if (other.cnpj != null) {
                return false;
            }
        } else if (!cnpj.equals(other.cnpj)) {
            return false;
        }
        return true;
    }
}
