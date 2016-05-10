package net.apryx.dnd.items;

public enum Property {
	TWOHANDED("Two handed", "Two handed weapons are worn with two hands"),
	VERSATILE("Versatile", "Weapon can be used with either one, or two hands, and will deal extra damage if worn with two"),

	ARMOR_LIGHT("Light", "Light armor, for people proficient in light armor"),
	ARMOR_MEDIUM("Medium", "Medium armor, for people proficient in light armor"),
	ARMOR_HEAVY("Heavy", "Heavy armor, for people proficient in heavy armor"),
	
	RANGED("Ranged", "Ranged weapon"),
	THROWN("Thrown", "You can throw thrown weapons"),
	LIGHT("Light", "Light weapons scale with dexterity, instead of strength, for attack rolls"),
	FINESSE("Finesse", "Finesse weapons scale with dexterity, instead of strength, for damage rolls"),
	REACH("Reach", "Weapon that gives 5 feat extra range"),
	
	//If your weapon is not either simple or martial, probably no one is proficient in using it.
	SIMPLE("Simple", "Most people can use simple weapons with proficientcy. These weapons are commenly found in the hands of the commeners."),
	MARTIAL("Martial", "Most warriors use martial weapons because these weapons best utilize their fighting style and trainging."),
	HEAVY("Heavy", "Characters who choose to wield heavy weapons must practice with these weapons to master their use. Weight and size make heavy weapons unwieldy, and so small characters can't wield heavy weapons."),
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
