package net.apryx.dnd.items;

public class Weapon extends Item {
	
	protected Damage damage;

	public Weapon(int id, String name, double weight, String description, Damage damage, PropertyValue...properties) {
		super(id, name, weight, description, properties);
		this.damage = damage;
	}
	
	public Damage getDamage() {
		return damage;
	}

	
	public static class Damage{
		public enum DamageType{
			SLASHING,BLUDGEONING,PIERCING
		}
		
		private double min;
		private double max;
		private DamageType type;
		
		public Damage(double min, double max, DamageType type){
			this.min = min;
			this.max = max;
			this.type = type;
		}
		
		public double getMax() {
			return max;
		}
		
		public double getMin() {
			return min;
		}
		
		public DamageType getType() {
			return type;
		}
		
		public double getVariableDamage(){
			return max - min;
		}
		
		public double getMinimumDamage(){
			return min;
		}
		
		@Override
		public String toString() {
			return (int)min + "-" + (int)max + " " + type;
		}
		
		@Override
		public boolean equals(Object other) {
			if(!(other instanceof Damage))
				return false;
			Damage damage = (Damage)other;
			
			if(!(Double.compare(damage.min, min) == 0))
				return false;
			if(!(Double.compare(damage.max, max) == 0))
				return false;
			if(!(damage.type == type)){
				return false;
			}
			
			return true;
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Weapon))
			return false;
		if(!super.equals(other))
			return false;
		
		Weapon weapon = (Weapon) other;
		
		if(!weapon.damage.equals(damage))
			return false;
		
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append("\t|\t");
		builder.append((int)weight);
		builder.append("lb\t|\t");
		builder.append(damage);
		builder.append("\t|\t");
		
		for(int i = 0; i < properties.size(); i++){
			if(i != 0)
				builder.append(", ");
			builder.append(properties.get(i));
		}
		
		return builder.toString();
	}
}
