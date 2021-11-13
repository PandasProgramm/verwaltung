package com.frozzenList.models;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "assessments")
@Entity
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(LocalDate evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public Double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
