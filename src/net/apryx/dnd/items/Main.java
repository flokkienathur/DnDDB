package net.apryx.dnd.items;

import net.apryx.dnd.world.City;
import net.apryx.dnd.world.Region;
import net.apryx.dnd.world.World;

public class Main {
	
	public static void main(String[] args) {
		
		World world = new World("Insula");
		
		Region insula = new Region("Insula");
		
		Region hamsher = new Region("Hamsher");
		City southville = new City("Southville");
		City northville = new City("Northville");
		
		hamsher.addCity(southville);
		hamsher.addCity(northville);
		
		world.addRegion(insula);
		world.addRegion(hamsher);
	}
	
}
