package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "producttypes")
@Entity
@Getter
@Setter
public class Producttype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productType_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Column(name = "durabilityDefaultWeeksFreezer")
    private Integer durabilityDefaultWeeksFreezer;

    public Integer getDurabilityDefaultWeeksFreezer() {
        return durabilityDefaultWeeksFreezer;
    }

    public void setDurabilityDefaultWeeksFreezer(Integer durabilityDefaultWeeksFreezer) {
        this.durabilityDefaultWeeksFreezer = durabilityDefaultWeeksFreezer;
    }
}
