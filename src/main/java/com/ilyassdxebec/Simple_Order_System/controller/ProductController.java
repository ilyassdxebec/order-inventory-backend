package com.ilyassdxebec.Simple_Order_System.controller;

import com.ilyassdxebec.Simple_Order_System.entity.Product;
import com.ilyassdxebec.Simple_Order_System.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService Service;
    @PostMapping("/products")
    public void AddProduct(@RequestBody Product product){
       Service.AddProduct(product);
    }
    @GetMapping("/products")
    public List<Product> GetAllProducts(){
       return  Service.GetAllProducts();
    }
    @PutMapping ("/products/{ID}")
    public void UpdateProduct(@PathVariable Long ID,@RequestBody Product product){
        Service.UpdateProduct(ID,product);
    }
    @DeleteMapping ("/products/{ID}")
    public void DeleteProduct(@PathVariable Long ID){
        Service.DeleteProduct(ID);
    }
}
