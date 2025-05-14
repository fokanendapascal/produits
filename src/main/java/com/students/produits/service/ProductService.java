package com.students.produits.service;


import com.students.produits.Dto.RegisterProductDto;
import com.students.produits.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct(RegisterProductDto input);
    Product getProductByName(String name);
    List<Product> getAllProducts();
    Product updateProduct(String name, Product product);
    void deleteProduct(Long id);
    //String lowStockAlert(Product input);

}
