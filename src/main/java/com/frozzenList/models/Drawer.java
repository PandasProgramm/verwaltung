package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "drawers")
@Entity
@Getter
@Setter
public class Drawer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drawer_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "drawerProdType", length = 200)
    private String drawerProdType;

}
