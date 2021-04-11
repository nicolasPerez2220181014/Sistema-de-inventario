package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categories_types database table.
 * 
 */
@Entity
@Table(name="categories_types")
@NamedQuery(name="CategoriesType.findAll", query="SELECT c FROM CategoriesType c")
public class CategoriesType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id")
	private Integer typeId;

	@Column(name="type_name")
	private String typeName;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="categoriesType")
	private List<Product> products;

	public CategoriesType() {
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategoriesType(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategoriesType(null);

		return product;
	}

}