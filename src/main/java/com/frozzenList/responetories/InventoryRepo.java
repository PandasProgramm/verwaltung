package com.frozzenList.responetories;

import com.frozzenList.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {
}
