package net.apryx.dnd.inventory;

import net.apryx.dnd.items.Item;

public class ItemStack {
	
	protected Item item;
	protected int amount;
	
	public ItemStack(Item item, int amount){
		this.amount = amount;
		this.item = item;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public Item getItem() {
		return item;
	}
}
