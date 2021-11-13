package com.frozzenList.responetories;

import com.frozzenList.models.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepo extends JpaRepository<Assessment, Long> {
}
