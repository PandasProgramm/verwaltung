package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "stock", indexes = {
        @Index(name = "shoppingList_id", columnList = "shoppingList_id")
})
@Entity
@Getter
@Setter
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shoppingList_id")
    private Shoppinglist shoppingList;

    @Column(name = "min_stock", nullable = false)
    private Integer minStock;

    @Column(name = "max_stock", nullable = false)
    private Integer maxStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
