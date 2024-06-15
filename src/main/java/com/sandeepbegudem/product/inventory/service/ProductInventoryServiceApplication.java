package com.sandeepbegudem.product.inventory.service;

import com.sandeepbegudem.product.inventory.service.entity.Product;
import com.sandeepbegudem.product.inventory.service.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ProductInventoryServiceApplication {

	private final ProductRepository productRepository;

	@Autowired
    public ProductInventoryServiceApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @PostConstruct
//	public void doInit() {
//		List<Product> productList = Stream.of(
//				new Product("LG 65 inch Curved TV", "electronics", 699.99, 250),
//				new Product("Sony ps5", "electronics", 499.99, 40),
//				new Product("Sofa", "Furniture", 1999.99, 22),
//				new Product("Apple Iphone 15 pro Cellphone", "electronics", 699.99, 250),
//				new Product("LG 34 inch Gaming Monitor", "electronics", 399.99, 29),
//				new Product("American Eagle T-shirt", "clothing", 699.99, 250),
//				new Product("Nike Air Jordan Shoes 10", "accessories", 179.99, 46),
//				new Product("Bose Earbuds", "electronics", 149.99, 55),
//				new Product("HP printer", "electronics", 109.99, 16),
//				new Product("Standing Desk", "electronics", 599.99, 66)).collect(Collectors.toList());
//		productRepository.saveAll(productList);
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoryServiceApplication.class, args);
	}

}
