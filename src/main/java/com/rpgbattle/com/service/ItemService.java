package com.rpgbattle.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgbattle.com.model.Item;
import com.rpgbattle.com.repository.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	ItemRepo itemRepo;
	
	public List<Item> getAllItems(){
		List<Item> items = itemRepo.findAll();
		return items;
	}

}
