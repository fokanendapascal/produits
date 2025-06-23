package com.students.produits.Dto;


public class RegisterProductDto {

    private String name;
    private Long price;
    private Long quantityStock;
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
