package com.students.produits.controller;

import com.students.produits.Dto.RegisterProductDto;
import com.students.produits.model.Product;
import com.students.produits.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class productController {

    private ProductService productService;

    @Operation(summary = "Register a new Product")
    @ApiResponse(responseCode = "200", description = "Product registered successfully")
    @PostMapping("/signup")
    void createProduct(@RequestBody RegisterProductDto input){
        productService.createProduct(input);
    }


    @Operation(summary = "Get a Product", description = "Return a single product")
    @ApiResponse(responseCode = "200", description = "product found")
    @GetMapping("/{name}")
    Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @Operation(summary = "Get All products", description = "Return list of products")
    @ApiResponse(responseCode = "200", description = "products found")
    @GetMapping("/")
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @Operation(summary = "Update a Product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product updated"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    @PutMapping("/{name}")
    Product updateProduct(@PathVariable String name, @RequestBody Product product){
        try {
            Product updatedProduct = productService.updateProduct(name, product);
            return ResponseEntity.ok(updatedProduct).getBody();
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }

    @Operation(summary = "Delete a Product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

//    @Operation(summary = "Assess the alert level of a Product", description = "Stock product greater than 5 or Alert Stock reached")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Stock product greater than 5"),
//            @ApiResponse(responseCode = "404", description = "Alert Stock reached")
//    })
//    @GetMapping("/{name}")
//    String lowStockAlert(Product name){
//
//        return productService.lowStockAlert(name);
//    }

}
