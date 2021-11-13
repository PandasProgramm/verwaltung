package com.frozzenList.responetories;

import com.frozzenList.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepo extends JpaRepository<Recipe, Long> {
}
