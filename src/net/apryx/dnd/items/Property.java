package net.apryx.dnd.items;

public enum Property {
	WEAPON_LIGHT("Light", "Light weapons scale with dexterity, instead of strength, for attack rolls"),
	FINESSE("Finesse", "Finesse weapons scale with dexterity, instead of strength, for damage rolls"),
	TWOHANDED("Two handed", "Two handed weapons are worn with two hands"),
	VERSATILE("Versatile", "Weapon can be used with either one, or two hands, and will deal extra damage if worn with two"),

	ARMOR_LIGHT("Light", "Light armor, for people proficient in light armor"),
	ARMOR_MEDIUM("Medium", "Medium armor, for people proficient in light armor"),
	ARMOR_HEAVY("Heavy", "Heavy armor, for people proficient in heavy armor"),
	;
	
	private String name;
	private String description;
	
	Property(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
