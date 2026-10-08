package com.Shopzy.demo.Controller;

import com.Shopzy.demo.Entity.Product;
import com.Shopzy.demo.Services.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
