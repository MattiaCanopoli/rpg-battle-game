package com.rpgbattle.com.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgbattle.com.model.Creature;
import com.rpgbattle.com.model.Item;
import com.rpgbattle.com.service.CreatureService;
import com.rpgbattle.com.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("/api/items")
public class ItemRestController {
	
	@Autowired
	ItemService itemService;

	
	@GetMapping
	public ResponseEntity<List<Item>> index() {
		
		List<Item> items = itemService.getAllItems();
		return new ResponseEntity<>(items, HttpStatus.OK); 
	}
}
