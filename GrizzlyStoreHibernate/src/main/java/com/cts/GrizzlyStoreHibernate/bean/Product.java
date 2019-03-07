package com.cts.GrizzlyStoreHibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Product_table")


public class Product {
	private String productid;
	private String categoryId;
	private String name;
	private String description;
	private float price;
	private String brand;
	
	
	private Category category;
	

	
	@Id
	@Column(name = "ProductId")
	public String getProductid() {
		return productid;
	}
	
	@ManyToOne
	@JoinColumn(name = "CategoryId")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", categoryId=" + categoryId + ", name=" + name + ", description="
				+ description + ", price=" + price + ", brand=" + brand + ", category=" + category + "]";
	}	

}
