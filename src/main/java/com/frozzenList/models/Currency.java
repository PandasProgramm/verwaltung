package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "currency")
@Entity
@Getter
@Setter
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id", nullable = false)
    private Long id;

    @Column(name = "country", nullable = false, length = 60)
    private String country;

    @Column(name = "currency_unit", nullable = false, length = 50)
    private String currencyUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
