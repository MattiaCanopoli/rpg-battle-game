package com.rpgbattle.com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name = "inventories")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	Character character; //TODO: collegamento 
	List<Item> item; //TODO: collegamento 
	
	int quantity;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	

}
