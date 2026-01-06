package com.ilyassdxebec.Simple_Order_System.service;

import com.ilyassdxebec.Simple_Order_System.entity.Product;
import com.ilyassdxebec.Simple_Order_System.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
 ProductRepo repo;
    public void AddProduct(Product product){
           repo.save(product);
    }
    public List<Product> GetAllProducts(){
        return repo.findAll();
    }
    public void UpdateProduct(Long ID,Product product) {
        /*the findById(ID) just loads the selected object and assigning means assigning all fields
        so when you update fields id is already there in existing which it was assigned to*/
        Product existing = repo.findById(ID).orElseThrow(RuntimeException::new);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setStock(product.getStock());

        repo.save(existing);

    }
    public void DeleteProduct(Long ID){
       Product TempoForDelete = repo.findById(ID).orElseThrow(RuntimeException::new);
       repo.delete(TempoForDelete);
    }
}