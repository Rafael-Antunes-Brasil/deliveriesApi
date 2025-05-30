package com.deliveries.deliveriesApi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.deliveries.deliveriesApi.dto.DelivererDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "del_deliverer")
public class DelivererEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_deliverer", updatable = false, nullable = false)
    private UUID idDeliverer;

    @Column(name = "deliverer_name", nullable = false)
    private String delivererName;

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

    @Column(name = "plate", nullable = false)
    private String plate;

    public DelivererEntity(DelivererDto deliverer) {
        BeanUtils.copyProperties(deliverer, this);
    }

    public DelivererEntity() {

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idDeliverer == null) ? 0 : idDeliverer.hashCode());
        result = prime * result + ((delivererName == null) ? 0 : delivererName.hashCode());
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
        DelivererEntity other = (DelivererEntity) obj;
        if (idDeliverer == null) {
            if (other.idDeliverer != null) {
                return false;
            }
        } else if (!idDeliverer.equals(other.idDeliverer)) {
            return false;
        }
        if (delivererName == null) {
            if (other.delivererName != null) {
                return false;
            }
        } else if (!delivererName.equals(other.delivererName)) {
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
