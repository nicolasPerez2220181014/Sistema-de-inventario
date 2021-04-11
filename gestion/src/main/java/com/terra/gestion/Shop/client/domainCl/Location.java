package com.terra.gestion.Shop.client.domainCl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {

    @Id
    private Integer locationId;
    private String locationData;
    //Pendiente revisar tipo de dato
    private Double locationPostalCode;
    private String locationExtraInfo;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationData() {
        return locationData;
    }

    public void setLocationData(String locationData) {
        this.locationData = locationData;
    }

    public Double getLocationPostalCode() {
        return locationPostalCode;
    }

    public void setLocationPostalCode(Double locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    public String getLocationExtraInfo() {
        return locationExtraInfo;
    }

    public void setLocationExtraInfo(String locationExtraInfo) {
        this.locationExtraInfo = locationExtraInfo;
    }
}