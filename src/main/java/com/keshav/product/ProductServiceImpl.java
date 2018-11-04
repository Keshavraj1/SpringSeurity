package com.keshav.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {
	
	private List<Product>products=new ArrayList<Product>();
	private long id=122;
	
	
	public ProductServiceImpl() {
		Product p=new Product();
		p.setId(++id);
		p.setDescription("This is my firstJob");
		products.add(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}

	@Override
	public long addProduct(Product product) {
		product.setId(++id);
		products.add(product);
		return id;
	}

}
