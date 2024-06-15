package com.sandeepbegudem.product.inventory.service.service;

import com.sandeepbegudem.product.inventory.service.entity.Product;
import com.sandeepbegudem.product.inventory.service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> fetchProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public Product updateProductStockByProductId(int id, int stock) {

        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product ID " + id + " Not Found"));

        if (existingProduct != null) existingProduct.setStock(existingProduct.getStock() + stock);
        assert existingProduct != null;
        return productRepository.save(existingProduct);
    }
}
