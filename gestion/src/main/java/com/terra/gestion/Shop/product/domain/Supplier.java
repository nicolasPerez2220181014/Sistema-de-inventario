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
public class Supplier {

    @Id
    private Integer supplierId;
    private String supplierName;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
