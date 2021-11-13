package com.frozzenList.responetories;

import com.frozzenList.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand, Long> {
}
