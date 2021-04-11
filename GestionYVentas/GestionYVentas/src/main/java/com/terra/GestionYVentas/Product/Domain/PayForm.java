package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pay_forms database table.
 * 
 */
@Entity
@Table(name="pay_forms")
@NamedQuery(name="PayForm.findAll", query="SELECT p FROM PayForm p")
public class PayForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pay_form_id")
	private Integer payFormId;

	@Column(name="pay_form_name")
	private String payFormName;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="payForm")
	private List<Bill> bills;

	//bi-directional many-to-one association to Purchas
	@OneToMany(mappedBy="payForm")
	private List<Purchas> purchases;

	public PayForm() {
	}

	public Integer getPayFormId() {
		return this.payFormId;
	}

	public void setPayFormId(Integer payFormId) {
		this.payFormId = payFormId;
	}

	public String getPayFormName() {
		return this.payFormName;
	}

	public void setPayFormName(String payFormName) {
		this.payFormName = payFormName;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setPayForm(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setPayForm(null);

		return bill;
	}

	public List<Purchas> getPurchases() {
		return this.purchases;
	}

	public void setPurchases(List<Purchas> purchases) {
		this.purchases = purchases;
	}

	public Purchas addPurchas(Purchas purchas) {
		getPurchases().add(purchas);
		purchas.setPayForm(this);

		return purchas;
	}

	public Purchas removePurchas(Purchas purchas) {
		getPurchases().remove(purchas);
		purchas.setPayForm(null);

		return purchas;
	}

}