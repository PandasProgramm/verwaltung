package com.frozzenList.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "assessments")
@Entity
@Getter
@Setter
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id", nullable = false)
    private Long id;

    @Column(name = "evaluation", nullable = false)
    private Double evaluation;

    @Column(name = "evaluationDate", nullable = false)
    private LocalDate evaluationDate;

    @Column(name = "description", length = 300)
    private String description;
}
