package com.students.produits.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterProductDto {

    private String name;
    private Long price;
    private Long quantity_stock;
}
