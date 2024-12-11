package com.rpgbattle.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgbattle.com.model.Creature;
import com.rpgbattle.com.repository.CreatureRepo;
import com.rpgbattle.com.repository.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo iRepo;

}
