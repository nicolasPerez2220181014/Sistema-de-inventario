package com.terra.GestionYVentas.Users.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="locations_id")
	private Integer locationsId;

	@Column(name="location_data")
	private String locationData;

	@Column(name="location_extra_info")
	private String locationExtraInfo;

	@Column(name="location_postal_code")
	private BigDecimal locationPostalCode;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="fk_cities_city_id")
	private City city;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="location")
	private List<Person> persons;

	public Location() {
	}

	public Integer getLocationsId() {
		return this.locationsId;
	}

	public void setLocationsId(Integer locationsId) {
		this.locationsId = locationsId;
	}

	public String getLocationData() {
		return this.locationData;
	}

	public void setLocationData(String locationData) {
		this.locationData = locationData;
	}

	public String getLocationExtraInfo() {
		return this.locationExtraInfo;
	}

	public void setLocationExtraInfo(String locationExtraInfo) {
		this.locationExtraInfo = locationExtraInfo;
	}

	public BigDecimal getLocationPostalCode() {
		return this.locationPostalCode;
	}

	public void setLocationPostalCode(BigDecimal locationPostalCode) {
		this.locationPostalCode = locationPostalCode;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setLocation(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setLocation(null);

		return person;
	}

}