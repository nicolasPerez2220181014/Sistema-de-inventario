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
public class States {

    @Id
    private Integer statesId;
    private String statesName;

    //Dejo Getters and Setters, por si las dudas, aunque esta decorado con Lombok
    //Cuando se resuelva duda se pueden dejar o eliminar


    public Integer getStatesId() {
        return statesId;
    }

    public void setStatesId(Integer statesId) {
        this.statesId = statesId;
    }

    public String getStatesName() {
        return statesName;
    }

    public void setStatesName(String statesName) {
        this.statesName = statesName;
    }
}
