package com.frozzenList.responetories;

import com.frozzenList.models.Producttype;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepo extends JpaRepository<Producttype, Long> {
}
