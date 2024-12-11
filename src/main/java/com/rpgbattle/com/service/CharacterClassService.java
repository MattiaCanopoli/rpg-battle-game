package com.rpgbattle.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rpgbattle.com.model.CharacterClass;
import com.rpgbattle.com.repository.CharacterClassRepo;

@Service
public class CharacterClassService {

	@Autowired
	CharacterClassRepo cClassRepo;

	public List<CharacterClass> getClasses() {

		return cClassRepo.findAll();
	}
}