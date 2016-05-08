package net.apryx.dnd.items;

import java.util.Arrays;
import java.util.List;

public class Item {
	
	public static final int WEAPON_ID = 10000;
	public static final int ARMOR_ID  = 20000;
	public static final int MISC_ID   = 00000;
	
	protected int id;
	protected String name;
	protected double weight;
	protected String description;
	protected List<PropertyValue> properties;
	
	public Item(int id, String name, double weight, String description, PropertyValue...properties){
		this.name = name;
		this.weight = weight;
		this.description = description;
		this.properties = Arrays.asList(properties);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public List<PropertyValue> getProperties() {
		return properties;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PropertyValue getPropertyOf(Property p){
		for(int i = 0; i < properties.size(); i++){
			if(properties.get(i).getProperty() == p){
				return properties.get(i);
			}
		}
		return null;
	}
	
	public boolean hasProperty(Property p){
		return getPropertyOf(p) != null;
	}
	
	public void setProperties(List<PropertyValue> properties) {
		this.properties = properties;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toShortString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(" (");
		builder.append((int)weight);
		builder.append(" lb");
		builder.append(")");
		
		return builder.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(id);
		builder.append("\t|\t");
		builder.append(name);
		builder.append("\t|\t");
		builder.append((int)weight);
		builder.append("lb\t|\t");
		
		for(int i = 0; i < properties.size(); i++){
			if(i != 0)
				builder.append(", ");
			builder.append(properties.get(i));
		}
		
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Item))
			return false;
		
		Item item = (Item)other;
		
		if(item.id != id)
			return false;
		if(!item.name.equals(name))
			return false;
		if(!item.description.equals(description))
			return false;
		if(!(item.weight == weight))
			return false;

		
		for(int i = 0; i < properties.size(); i++){
			if(!properties.get(i).equals(item.properties.get(i)))
				return false;
		}
		
		return true;
	}
	
	private static int lastID = 0;
	public static int getNextID(){
		return lastID++;
	}
	public static void setLastID(int id){
		lastID = id;
	}
}
