package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_serial")
	private Integer productSerial;

	@Temporal(TemporalType.DATE)
	@Column(name="product_expires_date")
	private Date productExpiresDate;

	@Column(name="product_image")
	private Integer productImage;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_sell_price")
	private BigDecimal productSellPrice;

	@Column(name="product_stock")
	private Integer productStock;

	//bi-directional many-to-one association to BillsProduct
	@OneToMany(mappedBy="product")
	private List<BillsProduct> billsProducts;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="fk_category_id")
	private Category category;

	//bi-directional many-to-one association to CategoriesType
	@ManyToOne
	@JoinColumn(name="fk_typestype_id")
	private CategoriesType categoriesType;

	//bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name="fk_supplier_id")
	private Supplier supplier;

	//bi-directional many-to-one association to Purchas
	@OneToMany(mappedBy="product")
	private List<Purchas> purchases;

	public Product() {
	}

	public Integer getProductSerial() {
		return this.productSerial;
	}

	public void setProductSerial(Integer productSerial) {
		this.productSerial = productSerial;
	}

	public Date getProductExpiresDate() {
		return this.productExpiresDate;
	}

	public void setProductExpiresDate(Date productExpiresDate) {
		this.productExpiresDate = productExpiresDate;
	}

	public Integer getProductImage() {
		return this.productImage;
	}

	public void setProductImage(Integer productImage) {
		this.productImage = productImage;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductSellPrice() {
		return this.productSellPrice;
	}

	public void setProductSellPrice(BigDecimal productSellPrice) {
		this.productSellPrice = productSellPrice;
	}

	public Integer getProductStock() {
		return this.productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public List<BillsProduct> getBillsProducts() {
		return this.billsProducts;
	}

	public void setBillsProducts(List<BillsProduct> billsProducts) {
		this.billsProducts = billsProducts;
	}

	public BillsProduct addBillsProduct(BillsProduct billsProduct) {
		getBillsProducts().add(billsProduct);
		billsProduct.setProduct(this);

		return billsProduct;
	}

	public BillsProduct removeBillsProduct(BillsProduct billsProduct) {
		getBillsProducts().remove(billsProduct);
		billsProduct.setProduct(null);

		return billsProduct;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public CategoriesType getCategoriesType() {
		return this.categoriesType;
	}

	public void setCategoriesType(CategoriesType categoriesType) {
		this.categoriesType = categoriesType;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<Purchas> getPurchases() {
		return this.purchases;
	}

	public void setPurchases(List<Purchas> purchases) {
		this.purchases = purchases;
	}

	public Purchas addPurchas(Purchas purchas) {
		getPurchases().add(purchas);
		purchas.setProduct(this);

		return purchas;
	}

	public Purchas removePurchas(Purchas purchas) {
		getPurchases().remove(purchas);
		purchas.setProduct(null);

		return purchas;
	}

}