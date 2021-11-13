package com.frozzenList.models;

import javax.persistence.*;

@Table(name = "ingredients")
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id", nullable = false)
    private Long id;

    @Column(name = "ingredient_type", nullable = false, length = 200)
    private String ingredientType;

    @Column(name = "image_path", length = 200)
    private String imagePath;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "quantity_unit", nullable = false, length = 200)
    private String quantityUnit;

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
