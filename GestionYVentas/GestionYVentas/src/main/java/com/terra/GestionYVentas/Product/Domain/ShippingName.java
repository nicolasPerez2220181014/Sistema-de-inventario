package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the shipping_names database table.
 * 
 */
@Entity
@Table(name="shipping_names")
@NamedQuery(name="ShippingName.findAll", query="SELECT s FROM ShippingName s")
public class ShippingName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="shipping_id")
	private Integer shippingId;

	@Column(name="shipping_name")
	private String shippingName;

	//bi-directional many-to-one association to Shipping
	@OneToMany(mappedBy="shippingName")
	private List<Shipping> shippings;

	public ShippingName() {
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public List<Shipping> getShippings() {
		return this.shippings;
	}

	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}

	public Shipping addShipping(Shipping shipping) {
		getShippings().add(shipping);
		shipping.setShippingName(this);

		return shipping;
	}

	public Shipping removeShipping(Shipping shipping) {
		getShippings().remove(shipping);
		shipping.setShippingName(null);

		return shipping;
	}

}