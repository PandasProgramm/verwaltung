package com.frozzenList.responetories;

import com.frozzenList.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepo extends JpaRepository<Currency, Long> {
}
