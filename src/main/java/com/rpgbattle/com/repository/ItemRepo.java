package com.rpgbattle.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgbattle.com.model.Item;

public interface ItemRepo extends JpaRepository<Item,Integer> {

}
