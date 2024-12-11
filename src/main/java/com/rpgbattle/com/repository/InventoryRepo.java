package com.rpgbattle.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgbattle.com.model.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory,Integer> {

}
