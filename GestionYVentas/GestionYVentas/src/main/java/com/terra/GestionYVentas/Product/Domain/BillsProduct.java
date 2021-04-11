package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bills_products database table.
 * 
 */
@Entity
@Table(name="bills_products")
@NamedQuery(name="BillsProduct.findAll", query="SELECT b FROM BillsProduct b")
public class BillsProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BillsProductPK id;

	private BigDecimal discount;

	private BigDecimal tax;

	private BigDecimal total;

	private Integer units;

	//bi-directional many-to-one association to Bill
	@ManyToOne
	@JoinColumn(name="fk_bill_id")
	private Bill bill;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="fk_product_serial")
	private Product product;

	public BillsProduct() {
	}

	public BillsProductPK getId() {
		return this.id;
	}

	public void setId(BillsProductPK id) {
		this.id = id;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Integer getUnits() {
		return this.units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Bill getBill() {
		return this.bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}