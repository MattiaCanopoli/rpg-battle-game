package com.rpgbattle.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Warrior {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
private String type;
private String name;
private Integer strength;
private Integer dexterity;
private Integer constitution;
private Integer wisdom;
private Integer intelligence;
private Integer level;
private Integer money;
private Integer lifePoints;
}
