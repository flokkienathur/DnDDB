package net.apryx.dnd.world;

import net.apryx.dnd.inventory.Inventory;
import net.apryx.dnd.people.Person;

public class Shop {
	
	protected Person shopkeeper;
	protected Inventory inventory;
	
	public Shop(Person shopkeeper){
		this.shopkeeper = shopkeeper;
		inventory = new Inventory();
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	
}
