package com.rpgbattle.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "level_breakpoints")
public class LevelBreakpoint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	int level;
	int capExp;
	int bonus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getCapExp() {
		return capExp;
	}
	public void setCapExp(int capExp) {
		this.capExp = capExp;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
