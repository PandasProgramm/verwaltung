package com.frozzenList.responetories;

import com.frozzenList.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Long> {
}
