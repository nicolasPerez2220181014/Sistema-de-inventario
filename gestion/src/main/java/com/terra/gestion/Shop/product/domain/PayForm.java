package com.terra.gestion.Shop.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayForm {

    @Id
    private Integer payFormId;
    private String payFormName;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getPayFormId() {
        return payFormId;
    }

    public void setPayFormId(Integer payFormId) {
        this.payFormId = payFormId;
    }

    public String getPayFormName() {
        return payFormName;
    }

    public void setPayFormName(String payFormName) {
        this.payFormName = payFormName;
    }
}
