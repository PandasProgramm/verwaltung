package com.frozzenList.models;

import javax.persistence.*;

@Table(name = "currency")
@Entity
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id", nullable = false)
    private Long id;

    @Column(name = "country", nullable = false, length = 60)
    private String country;

    @Column(name = "currency_unit", nullable = false, length = 50)
    private String currencyUnit;

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
