package com.frozzenList.models;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "products", indexes = {
        @Index(name = "product_type_id", columnList = "product_type_id"),
        @Index(name = "stock_id", columnList = "stock_id"),
        @Index(name = "currency_id", columnList = "currency_id"),
        @Index(name = "brand_id", columnList = "brand_id")
})
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private Producttype productType;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @Column(name = "product_name", length = 200)
    private String productName;

    @Column(name = "good_until", nullable = false)
    private LocalDate goodUntil;

    @Column(name = "bought_at", nullable = false)
    private LocalDate boughtAt;

    public LocalDate getBoughtAt() {
        return boughtAt;
    }

    public void setBoughtAt(LocalDate boughtAt) {
        this.boughtAt = boughtAt;
    }

    public LocalDate getGoodUntil() {
        return goodUntil;
    }

    public void setGoodUntil(LocalDate goodUntil) {
        this.goodUntil = goodUntil;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Producttype getProductType() {
        return productType;
    }

    public void setProductType(Producttype productType) {
        this.productType = productType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
