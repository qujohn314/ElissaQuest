package entities;
import java.util.ArrayList;

import items.Consumable;
import items.Equipment;
import items.Inventory;
import items.Item;
import items.Weapon;
import misc.Pair;
import run.GamePlay;
import spells.Spell;

public class Player extends Entity{
	public GamePlay runner;
	public int level;
	public int x;
	public int y;/*
	public ArrayList<Pair<Item,Integer>> inventory;
	public ArrayList<Pair<Item,Integer>> pots;
	public ArrayList<Pair<Item,Integer>> weapons;
	public ArrayList<Pair<Item,Integer>> equipment;*/
	public Inventory inventory;
	public ArrayList<Spell> spells;
	
	public Player(GamePlay d) {
		runner = d;
		level = 1;
		health = 12;
		maxHealth = 20;
		maxMana = 10;
		mana = 8;
		maxStamina = 30;
		stamina = 15;
		
		inventory = new Inventory();/*new ArrayList<Pair<Item,Integer>>();
		pots = new ArrayList<Pair<Item,Integer>>();
		weapons = new ArrayList<Pair<Item,Integer>>();
		equipment = new ArrayList<Pair<Item,Integer>>();*/

		spells = new ArrayList<Spell>();
		
		inventory.add(Consumable.Consumables.aether()); // testing
	}
	
	
	
	
	
	
	/*
	public boolean removeItem(Item i,int amt) {
		boolean dispose = false;
		if(!containsItem(i)) {System.out.println("No item to remove!");return false;}
		if(inventory.get(findItem(i,inventory)).second - amt < 0) return false;
		
		inventory.get(findItem(i,inventory)).second -= amt;
		if(inventory.get(findItem(i,inventory)).second == 0) {dispose = true;inventory.remove(findItem(i,inventory));}
			
		if(i instanceof Consumable) {
			pots.get(findItem(i,pots)).second-=amt;
			if(dispose) pots.remove(findItem(i,pots));
		}
		else if(i instanceof Weapon) {
			weapons.get(findItem(i,weapons)).second-=amt;
			if(dispose) weapons.remove(findItem(i,weapons));
		}
		else if(i instanceof Equipment) {
			equipment.get(findItem(i,equipment)).second-=amt;
			if(dispose) equipment.remove(findItem(i,equipment));
		}
		
		return true;
	}
	
	public boolean containsItem(Item i) {
		for(Pair<Item,Integer> p : inventory)
			if(p.first.getName().equals(i.getName()))
				return true;
		return false;
	}
	
	public int findItem(Item i,ArrayList<Pair<Item,Integer>> list) {
		for(int c = 0;c<list.size();c++)
			if(list.get(c).first.getName().equals(i.getName()))
				return c;
		return -1;
	}
	
	public void addItem(Item i) {
		if(containsItem(i)) {
			for(int c = 0;c<inventory.size();c++) {
				if(inventory.get(c).first.getName().equals(i.getName())) {
					inventory.get(c).second += 1;
					if(i instanceof Consumable) pots.get(findItem(i,pots)).second++;
					else if(i instanceof Weapon)  weapons.get(findItem(i,weapons)).second++;
					else if(i instanceof Equipment)  equipment.get(findItem(i,equipment)).second++;
				}
			}
		}else {
			inventory.add(new Pair<Item,Integer>(i,1));
			if(i instanceof Consumable) pots.add(new Pair<Item,Integer>(i,1));
			else if(i instanceof Weapon)  weapons.add(new Pair<Item,Integer>(i,1));
			else if(i instanceof Equipment)  equipment.add(new Pair<Item,Integer>(i,1));
		}
	}
	public void addItem(Item i,int amt) {
		if(containsItem(i)) {
			for(int c = 0;c<inventory.size();c++) {
				if(inventory.get(c).first.getName().equals(i.getName())) {
					inventory.get(c).second += amt;
					if(i instanceof Consumable) pots.get(findItem(i,pots)).second+=amt;
					else if(i instanceof Weapon)  weapons.get(findItem(i,weapons)).second+=amt;
					else if(i instanceof Equipment)  equipment.get(findItem(i,equipment)).second+=amt;
				}
			}
		}else {
			inventory.add(new Pair<Item,Integer>(i,amt));
			if(i instanceof Consumable) pots.add(new Pair<Item,Integer>(i,amt));
			else if(i instanceof Weapon)  weapons.add(new Pair<Item,Integer>(i,amt));
			else if(i instanceof Equipment)  equipment.add(new Pair<Item,Integer>(i,amt));
		}
	}*/

}

