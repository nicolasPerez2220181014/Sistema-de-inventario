package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the shippings database table.
 * 
 */
@Entity
@Table(name="shippings")
@NamedQuery(name="Shipping.findAll", query="SELECT s FROM Shipping s")
public class Shipping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="shipping_guide")
	private Integer shippingGuide;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="shipping")
	private List<Bill> bills;

	//bi-directional many-to-one association to ShippingName
	@ManyToOne
	@JoinColumn(name="shipping_namesshipping_id")
	private ShippingName shippingName;

	public Shipping() {
	}

	public Integer getShippingGuide() {
		return this.shippingGuide;
	}

	public void setShippingGuide(Integer shippingGuide) {
		this.shippingGuide = shippingGuide;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setShipping(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setShipping(null);

		return bill;
	}

	public ShippingName getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(ShippingName shippingName) {
		this.shippingName = shippingName;
	}

}