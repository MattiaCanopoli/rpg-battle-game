package com.rpgbattle.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgbattle.com.model.Creature;

public interface CreatureRepo extends JpaRepository<Creature,Integer> {

}
