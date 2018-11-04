package com.keshav.product;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
@Path("/productService")
public interface ProductService {
	@GET
	@Path("/products")
	public List<Product>getProducts();
	@POST
	@Path("/products")
	public long addProduct(Product product);

}
