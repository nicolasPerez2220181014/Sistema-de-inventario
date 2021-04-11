package com.terra.GestionYVentas.Users.Domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the identifications_names database table.
 * 
 */
@Entity
@Table(name="identifications_names")
@NamedQuery(name="IdentificationsName.findAll", query="SELECT i FROM IdentificationsName i")
public class IdentificationsName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"identification _id\"")
	private Integer identification_Id;

	@Column(name="identification_name")
	private String identificationName;

	public IdentificationsName() {
	}

	public Integer getIdentification_Id() {
		return this.identification_Id;
	}

	public void setIdentification_Id(Integer identification_Id) {
		this.identification_Id = identification_Id;
	}

	public String getIdentificationName() {
		return this.identificationName;
	}

	public void setIdentificationName(String identificationName) {
		this.identificationName = identificationName;
	}

}