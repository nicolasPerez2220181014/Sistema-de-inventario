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
public class BillProduct {

    @Id
    private Integer billProductId;
    private Integer billProductUnits;
    private Double billProductDiscount;
    private Double billProductTotal;
    private Double billProductTax;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getBillProductId() {
        return billProductId;
    }

    public void setBillProductId(Integer billProductId) {
        this.billProductId = billProductId;
    }

    public Integer getBillProductUnits() {
        return billProductUnits;
    }

    public void setBillProductUnits(Integer billProductUnits) {
        this.billProductUnits = billProductUnits;
    }

    public Double getBillProductDiscount() {
        return billProductDiscount;
    }

    public void setBillProductDiscount(Double billProductDiscount) {
        this.billProductDiscount = billProductDiscount;
    }

    public Double getBillProductTotal() {
        return billProductTotal;
    }

    public void setBillProductTotal(Double billProductTotal) {
        this.billProductTotal = billProductTotal;
    }

    public Double getBillProductTax() {
        return billProductTax;
    }

    public void setBillProductTax(Double billProductTax) {
        this.billProductTax = billProductTax;
    }
}
