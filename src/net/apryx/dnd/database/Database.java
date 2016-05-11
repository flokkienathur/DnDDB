package net.apryx.dnd.database;

import net.apryx.dnd.items.Item;
import net.apryx.dnd.world.Location;

//TODO refactor
public class Database {
	
	protected static DatabaseHelper helper;
	protected static Item[] items;
	protected static Location[] locations;
	
	public Item getItemById(int id){
		return items[id];
	}
	
	public void setItem(Item item){
		items[item.getId()] = item;
		//TODO save item
	}
	
	static {init();} private static void init(){
		helper = new DatabaseHelper("dnd.db");
	}
}
