package net.apryx.dnd.world;

import java.util.ArrayList;
import java.util.List;

public class World extends Location {
	
	protected List<Region> regions;
	protected String name;
	
	public World(String name){
		regions = new ArrayList<Region>();
		this.name = name;
	}
	
	public void addRegion(Region region){
		region.setWorld(this);
		regions.add(region);
	}
	
	public void removeRegion(Region region){
		region.setWorld(null); //This might cause nasty bugs
		regions.remove(region);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
