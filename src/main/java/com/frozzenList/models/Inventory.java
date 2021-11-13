package com.frozzenList.models;

import javax.persistence.*;

@Table(name = "inventories")
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "inventory_place", length = 200)
    private String inventoryPlace;

    @Column(name = "inventory_type", length = 200)
    private String inventoryType;

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getInventoryPlace() {
        return inventoryPlace;
    }

    public void setInventoryPlace(String inventoryPlace) {
        this.inventoryPlace = inventoryPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
