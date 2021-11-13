package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "shoppinglists")
@Entity
@Getter
@Setter
public class Shoppinglist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shoppingList_id", nullable = false)
    private Long id;

    @Column(name = "FromDate", nullable = false)
    private LocalDate fromDate;

    @Column(name = "entireDate", nullable = false)
    private LocalDate entireDate;

    @Column(name = "budget")
    private Double budget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
