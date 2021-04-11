package com.terra.GestionYVentas.Product.Domain;




import java.io.Serializable;
import javax.persistence.*;

import com.terra.GestionYVentas.Users.Domain.Person;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the bills database table.
 * 
 */
@Entity
@Table(name="bills")
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bill_id")
	private Integer billId;

	@Temporal(TemporalType.DATE)
	@Column(name="bill_date")
	private Date billDate;

	//bi-directional many-to-one association to PayForm
	@ManyToOne
	@JoinColumn(name="fk_pay_form_id")
	private PayForm payForm;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="personsperson_id")
	private Person person;

	//bi-directional many-to-one association to Shipping
	@ManyToOne
	@JoinColumn(name="fk_shipping_guide")
	private Shipping shipping;

	//bi-directional many-to-one association to BillsProduct
	@OneToMany(mappedBy="bill")
	private List<BillsProduct> billsProducts;

	public Bill() {
	}

	public Integer getBillId() {
		return this.billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Date getBillDate() {
		return this.billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public PayForm getPayForm() {
		return this.payForm;
	}

	public void setPayForm(PayForm payForm) {
		this.payForm = payForm;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Shipping getShipping() {
		return this.shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public List<BillsProduct> getBillsProducts() {
		return this.billsProducts;
	}

	public void setBillsProducts(List<BillsProduct> billsProducts) {
		this.billsProducts = billsProducts;
	}

	public BillsProduct addBillsProduct(BillsProduct billsProduct) {
		getBillsProducts().add(billsProduct);
		billsProduct.setBill(this);

		return billsProduct;
	}

	public BillsProduct removeBillsProduct(BillsProduct billsProduct) {
		getBillsProducts().remove(billsProduct);
		billsProduct.setBill(null);

		return billsProduct;
	}

}