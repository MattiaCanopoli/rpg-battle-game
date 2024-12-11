package com.rpgbattle.com.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rpgbattle.com.model.Item;
import com.rpgbattle.com.model.Race;
import com.rpgbattle.com.service.ItemService;
import com.rpgbattle.com.service.RaceService;

@RestController
@CrossOrigin
@RequestMapping("/api/races")
public class RaceRestController {
	
	@Autowired
	RaceService raceService;

	
	@GetMapping
	public ResponseEntity<List<Race>> index() {
		
		List<Race> races = raceService.getAllRaces();
		return new ResponseEntity<>(races, HttpStatus.OK); 
	}
}
