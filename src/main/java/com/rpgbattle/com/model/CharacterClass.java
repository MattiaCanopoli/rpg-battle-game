package com.rpgbattle.com.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_classes")
public class CharacterClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
    @OneToMany(mappedBy="characterClass")
    private Set<Creature> creatures;
	
    @ManyToMany
    @JoinTable(
      name = "item_character_class", 
      joinColumns = @JoinColumn(name = "item_id"), 
      inverseJoinColumns = @JoinColumn(name = "character_classes_id"))
    Set<Item> items;
    
	String name;
	// ho aggiunto le statistiche di classe base
	int strength;
	int dexterity;
	int constitution;
	int wisdom;
	int intelligence;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

}
