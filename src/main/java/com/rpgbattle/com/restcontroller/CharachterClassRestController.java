package com.rpgbattle.com.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgbattle.com.model.CharacterClass;
import com.rpgbattle.com.service.CharacterClassService;

@RestController
@CrossOrigin
@RequestMapping("/api/classes")
public class CharachterClassRestController {
	
	@Autowired
	CharacterClassService cClassService;
	
	
	@GetMapping
	public ResponseEntity<List<CharacterClass>> index() {
		
		List<CharacterClass> cClasses = cClassService.getClasses();
		return new ResponseEntity<>(cClasses, HttpStatus.OK); 
	}

}
