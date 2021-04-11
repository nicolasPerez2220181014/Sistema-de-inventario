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
public class Product {

    @Id
    private Integer productInternalSerialId;
    private String productName;
    private Double productSellPrice;
    private Date productExpiresDate;
    private Integer productStock;
    private Integer productImage;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getProductInternalSerialId() {
        return productInternalSerialId;
    }

    public void setProductInternalSerialId(Integer productInternalSerialId) {
        this.productInternalSerialId = productInternalSerialId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(Double productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public Date getProductExpiresDate() {
        return productExpiresDate;
    }

    public void setProductExpiresDate(Date productExpiresDate) {
        this.productExpiresDate = productExpiresDate;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductImage() {
        return productImage;
    }

    public void setProductImage(Integer productImage) {
        this.productImage = productImage;
    }
}
