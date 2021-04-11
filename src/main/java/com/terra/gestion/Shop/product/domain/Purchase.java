package com.terra.gestion.Shop.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Purchase {

    @Id
    private Integer purchaseId;
    private Date purchaseDate;
    private Double purchaseUnitCost;
    private Integer purchaseUnits;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getPurchaseUnitCost() {
        return purchaseUnitCost;
    }

    public void setPurchaseUnitCost(Double purchaseUnitCost) {
        this.purchaseUnitCost = purchaseUnitCost;
    }

    public Integer getPurchaseUnits() {
        return purchaseUnits;
    }

    public void setPurchaseUnits(Integer purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }
}
