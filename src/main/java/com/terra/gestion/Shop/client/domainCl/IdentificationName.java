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
public class IdentificationName {

    @Id
    private Integer identificationId;
    private String identificationName;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getIdentificationId() {
        return identificationId;
    }

    public void setIdentificationId(Integer identificationId) {
        this.identificationId = identificationId;
    }

    public String getIdentificationName() {
        return identificationName;
    }

    public void setIdentificationName(String identificationName) {
        this.identificationName = identificationName;
    }
}
