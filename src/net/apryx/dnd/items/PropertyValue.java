package net.apryx.dnd.items;

public class PropertyValue {
	
	private Property property;
	private Object value;

	public PropertyValue(Property prop){
		this.property = prop;
		this.value = null;
	}
	
	public PropertyValue(Property prop, Object value){
		this.property = prop;
		this.value = value;
	}
	
	public Property getProperty() {
		return property;
	}
	
	public Object getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof PropertyValue))
			return false;
		PropertyValue other = (PropertyValue) arg;
		
		//compare values
		if(value == null){
			if(other.value != null)
				return false;
		}else{
			if(other.value == null)
				return false;
			if(!value.equals(other.value))
				return false;
		}
		
		if(this.property != other.property)
			return false;

		return true;
	}
	
	@Override
	public String toString() {
		return property + (value == null ? "" : "(" + value + ")");
	}
}
