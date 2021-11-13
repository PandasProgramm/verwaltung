package com.frozzenList.responetories;

import com.frozzenList.models.Shoppinglist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShoppingListRepo extends JpaRepository<Shoppinglist, Long> {
}
