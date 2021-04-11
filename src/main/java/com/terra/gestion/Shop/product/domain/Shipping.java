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
public class Shipping {

    @Id
    private Integer shippingGuideId;

    public Integer getShippingGuideId() {
        return shippingGuideId;
    }

    public void setShippingGuideId(Integer shippingGuideId) {
        this.shippingGuideId = shippingGuideId;
    }
}
