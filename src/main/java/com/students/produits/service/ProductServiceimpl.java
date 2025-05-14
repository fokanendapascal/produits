package com.students.produits.service;

import com.students.produits.Dto.RegisterProductDto;
import com.students.produits.model.Product;
import com.students.produits.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceimpl implements ProductService{

    private ProductRepository productRepository;

    @Override
    public void createProduct(RegisterProductDto input) {

        if(productRepository.findProductByName(input.getName()).isEmpty()){

            Product product = new Product();
            product.setName(input.getName());
            product.setPrice(input.getPrice());
            product.setQuantity_stock(input.getQuantity_stock());

            productRepository.save(product);
        }else{
            throw new IllegalStateException("The product already exists!");
        }

    }

    @Override
    public Product getProductByName(String name) {
        Optional<Product> product = productRepository.findProductByName(name);

        if (product.isEmpty()){
            throw new IllegalStateException("Product with name " + name + "does not exists");
        }else if(product.get().getQuantity_stock() < 5){
            throw new IllegalStateException("Alert Stock reached!(least than 5)" ) ;
        }
        return product.orElseThrow();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(String name, Product product) {

        Product updatedProduct = productRepository.findProductByName(name).orElseThrow();
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setQuantity_stock(product.getQuantity_stock());

        return productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProduct(Long id) {

        boolean exists = productRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Product with id " + id + "does not exists");
        }
        productRepository.deleteById(id);
    }

//    @Override
//    public String lowStockAlert(Product input) {
//        Product product = productRepository.findProductByName(input.getName());
//        if( product.getQuantity_stock() < 5 ) {
//            throw new IllegalStateException("Alert Stock reached!") ;
//        }
//        return "Stock greater than 5 ";
//    }
}
