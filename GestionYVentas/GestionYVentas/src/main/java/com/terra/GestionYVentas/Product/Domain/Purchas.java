package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the purchases database table.
 * 
 */
@Entity
@Table(name="purchases")
@NamedQuery(name="Purchas.findAll", query="SELECT p FROM Purchas p")
public class Purchas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_id")
	private Integer purchaseId;

	@Temporal(TemporalType.DATE)
	@Column(name="purchase_date")
	private Date purchaseDate;

	@Column(name="purchase_unit_cost")
	private BigDecimal purchaseUnitCost;

	@Column(name="purchase_units")
	private Integer purchaseUnits;

	//bi-directional many-to-one association to PayForm
	@ManyToOne
	@JoinColumn(name="fk_pay_form_id")
	private PayForm payForm;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="fk_product_internal_serial")
	private Product product;

	public Purchas() {
	}

	public Integer getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPurchaseUnitCost() {
		return this.purchaseUnitCost;
	}

	public void setPurchaseUnitCost(BigDecimal purchaseUnitCost) {
		this.purchaseUnitCost = purchaseUnitCost;
	}

	public Integer getPurchaseUnits() {
		return this.purchaseUnits;
	}

	public void setPurchaseUnits(Integer purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public PayForm getPayForm() {
		return this.payForm;
	}

	public void setPayForm(PayForm payForm) {
		this.payForm = payForm;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}