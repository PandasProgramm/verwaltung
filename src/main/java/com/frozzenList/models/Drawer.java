package com.frozzenList.models;

import javax.persistence.*;

@Table(name = "drawers")
@Entity
public class Drawer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drawer_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "drawerProdType", length = 200)
    private String drawerProdType;

    public String getDrawerProdType() {
        return drawerProdType;
    }

    public void setDrawerProdType(String drawerProdType) {
        this.drawerProdType = drawerProdType;
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
