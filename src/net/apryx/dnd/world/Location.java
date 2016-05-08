package net.apryx.dnd.world;

public abstract class Location {
	
	public static final int WORLD_ID = 0;
	public static final int REGION_ID = 10000;
	public static final int CITY_ID = 20000;
	
	protected int id;
	
	public Location(){
		this.id = getNextID();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	private static int lastID = 0;
	public static int getNextID(){
		return lastID++;
	}
	public static void setLastID(int id){
		lastID = id;
	}
}
