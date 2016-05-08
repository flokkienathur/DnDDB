package net.apryx.dnd.world;

import java.util.List;

public class Region extends Location {
	
	protected String name;
	protected World world;
	protected List<City> cities;
	
	public Region(String name){
		this.name = name;
	}
	
	public World getWorld() {
		return world;
	}
	
	public void addCity(City city){
		city.setRegion(this);
		cities.add(city);
	}
	
	public void removeCity(City city){
		city.setRegion(null); //This may cause nasty nasty pasty bugs
		cities.remove(city);
	}
	
	public void setWorld(World world) {
		this.world = world;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
