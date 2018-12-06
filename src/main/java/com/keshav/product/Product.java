package com.keshav.product;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Product {

	private String description;
	private long id;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product{" +
				"description='" + description + '\'' +
				", id=" + id +
				'}';
	}
	

}
