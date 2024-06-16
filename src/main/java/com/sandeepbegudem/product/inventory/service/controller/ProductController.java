package com.sandeepbegudem.product.inventory.service.controller;

import com.sandeepbegudem.product.inventory.service.entity.Product;
import com.sandeepbegudem.product.inventory.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {

    private final  ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<Product> retrieveAllProducts() {
        return productService.fetchAllProducts();
    }

    @QueryMapping
    public List<Product> retrieveAllProductsByCategory(@Argument String category) {
        return productService.fetchProductsByCategory(category);
    }

    @MutationMapping
    public Product updateProductStockById(@Argument int id, @Argument int stock) {
        return productService.updateProductStockByProductId(id, stock);
    }

//    @MutationMapping
//    public Product createNewProduct(@Argument int id, @Argument int stockQuantity) {
//        return productService.updateProductStockByProductId(id, stockQuantity);
//    }



}
