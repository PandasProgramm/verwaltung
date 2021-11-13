package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "recipes")
@Entity
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", nullable = false)
    private Long id;

    @Column(name = "identifier", length = 200)
    private String identifier;

    @Column(name = "image_source", length = 200)
    private String imageSource;

    @Column(name = "recipe_type", length = 200)
    private String recipeType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
