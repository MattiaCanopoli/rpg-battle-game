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
import com.rpgbattle.com.service.CreatureService;

@RestController
@CrossOrigin
@RequestMapping("/api/creatures")
public class CreatureRestController {
	
	@Autowired
	CreatureService cService;

	
	@GetMapping
	public ResponseEntity<List<Creature>> index() {
		
		List<Creature> creatures = cService.getAllCreatures();
		return new ResponseEntity<>(creatures, HttpStatus.OK); 
	}
}
