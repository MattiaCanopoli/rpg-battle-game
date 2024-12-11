package com.rpgbattle.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgbattle.com.model.Race;
import com.rpgbattle.com.repository.RaceRepo;

@Service
public class RaceService {
	
	@Autowired
	RaceRepo raceRepo;
	
	public List<Race> getAllRaces(){
		List<Race> races = raceRepo.findAll();
		return races;
	}

}
