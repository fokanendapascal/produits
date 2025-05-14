package com.students.produits.model;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String name;



    @Column(nullable = false)
    private Long price;


    @Column(nullable = false)
    private Long quantityStock;


    @Column(nullable = true)
    private boolean selected;

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public Long getQuantityStock() {
        return quantityStock;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setQuantityStock(Long quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
