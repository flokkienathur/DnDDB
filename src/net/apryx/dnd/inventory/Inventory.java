package net.apryx.dnd.inventory;

import java.util.ArrayList;
import java.util.List;

import net.apryx.dnd.items.Item;

public class Inventory {
	
	protected List<ItemStack> items;
	protected int id;
	
	public Inventory(){
		items = new ArrayList<ItemStack>();
		id = getNextID();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void addItem(Item item, int amount){
		ItemStack stack = getStack(item);
		if(stack == null){
			stack = new ItemStack(item, 0);
			items.add(stack);
		}
		
		stack.amount += amount;
		
		if(stack.amount <= 0){
			removeStack(item);
		}
		
	}
	
	public void removeItem(Item item, int amount){
		addItem(item, -amount);
	}
	
	public void removeStack(Item item){
		int index = -1;
		for(int i = 0; i < items.size(); i++){
			if(items.get(i).getItem().equals(item)){
				index = i;
			}
		}
		
		if(index >= 0){
			items.remove(index);
		}
	}
	
	public double getWeight(){
		double sum = 0;
		
		for(ItemStack stack : items){
			sum += stack.amount * stack.getItem().getWeight();
		}
		
		return sum;
	}
	
	public ItemStack getStack(Item item){
		for(ItemStack stack : items){
			if(stack.getItem().equals(item))
				return stack;
		}
		return null;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < items.size(); i++){
			if(i != 0)
				builder.append("\n");
			
			ItemStack stack = items.get(i);
			builder.append(stack.getAmount());
			builder.append("x");
			builder.append("\t");
			builder.append((int)(stack.getItem().getWeight() * stack.getAmount()));
			builder.append(" lb");
			builder.append("\t");
			builder.append(stack.getItem().toShortString());
		}
		
		return builder.toString();
	}
	
	private static int lastID = 0;
	public static int getNextID(){
		return lastID++;
	}
	public static void setLastID(int id){
		lastID = id;
	}
}
