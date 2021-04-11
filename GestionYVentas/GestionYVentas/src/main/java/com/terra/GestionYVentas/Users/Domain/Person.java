package com.terra.GestionYVentas.Users.Domain;

import java.io.Serializable;
import javax.persistence.*;

import com.terra.GestionYVentas.Product.Domain.Bill;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persons database table.
 * 
 */
@Entity
@Table(name="persons")
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="person_id")
	private Integer personId;

	@Column(name="\"Fk_namesidentification _id\"")
	private Integer fk_namesidentification__id;

	@Temporal(TemporalType.DATE)
	@Column(name="person_birthdate")
	private Date personBirthdate;

	@Column(name="person_cellphone")
	private Integer personCellphone;

	@Temporal(TemporalType.DATE)
	@Column(name="person_creation_date")
	private Date personCreationDate;

	@Column(name="person_email")
	private String personEmail;

	@Column(name="person_identification")
	private Integer personIdentification;

	@Column(name="person_lastname")
	private String personLastname;

	@Column(name="person_name")
	private String personName;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="person")
	private List<Bill> bills;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="fk_locations_locations_id")
	private Location location;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="fk_roles_id")
	private Role role;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="fk_users_user_nick_name")
	private User user;

	public Person() {
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getFk_namesidentification__id() {
		return this.fk_namesidentification__id;
	}

	public void setFk_namesidentification__id(Integer fk_namesidentification__id) {
		this.fk_namesidentification__id = fk_namesidentification__id;
	}

	public Date getPersonBirthdate() {
		return this.personBirthdate;
	}

	public void setPersonBirthdate(Date personBirthdate) {
		this.personBirthdate = personBirthdate;
	}

	public Integer getPersonCellphone() {
		return this.personCellphone;
	}

	public void setPersonCellphone(Integer personCellphone) {
		this.personCellphone = personCellphone;
	}

	public Date getPersonCreationDate() {
		return this.personCreationDate;
	}

	public void setPersonCreationDate(Date personCreationDate) {
		this.personCreationDate = personCreationDate;
	}

	public String getPersonEmail() {
		return this.personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public Integer getPersonIdentification() {
		return this.personIdentification;
	}

	public void setPersonIdentification(Integer personIdentification) {
		this.personIdentification = personIdentification;
	}

	public String getPersonLastname() {
		return this.personLastname;
	}

	public void setPersonLastname(String personLastname) {
		this.personLastname = personLastname;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setPerson(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setPerson(null);

		return bill;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}