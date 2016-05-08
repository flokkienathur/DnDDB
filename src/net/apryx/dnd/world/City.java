package net.apryx.dnd.world;

public class City extends Location {
	
	protected String name;
	protected Region region;
	
	public City(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}
	
	public Region getRegion() {
		return region;
	}
}
