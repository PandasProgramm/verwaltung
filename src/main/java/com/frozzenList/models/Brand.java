package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "brands")
@Entity
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id", nullable = false)
    private Long id;

    @Column(name = "brand_name", nullable = false, length = 200)
    private String brandName;
}
