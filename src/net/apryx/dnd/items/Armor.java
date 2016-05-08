package net.apryx.dnd.items;

public class Armor extends Item{

	enum Scaling{
		FULL, PARTIAL, NONE
	}
	
	protected Scaling scaling;
	protected double armorClass;
	
	public Armor(int id, String name, double weight, String description, double acBonus, Scaling scaling, PropertyValue...properties) {
		super(id, name, weight, description, properties);
		this.armorClass = acBonus;
		this.scaling = scaling;
	}
	
	public double getArmorClass() {
		return armorClass;
	}
	
	public Scaling getScaling() {
		return scaling;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append("\t|\t");
		builder.append((int)weight);
		builder.append("lb\t|\t");
		builder.append((int)armorClass);
		builder.append(" ");
		builder.append(scaling);
		builder.append("\t|\t");
		
		for(int i = 0; i < properties.size(); i++){
			if(i != 0)
				builder.append(", ");
			builder.append(properties.get(i));
		}
		
		return builder.toString();
	}

}
