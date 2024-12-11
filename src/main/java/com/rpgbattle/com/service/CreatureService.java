package com.rpgbattle.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgbattle.com.model.Creature;
import com.rpgbattle.com.repository.CreatureRepo;

@Service
public class CreatureService {
	
	@Autowired
	CreatureRepo creatureRepo;

	
	public List<Creature> getAllCreatures(){
		List<Creature> creatures = creatureRepo.findAll();
		return creatures;
	}
}
