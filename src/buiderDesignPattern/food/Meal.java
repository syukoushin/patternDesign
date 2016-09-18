package buiderDesignPattern.food;
import java.util.ArrayList;
import java.util.List;

import buiderDesignPattern.interfaces.Item;

public class Meal {
	
	private List<Item> items = new ArrayList<>();
	public void addItem(Item item){
		this.items.add(item);
	}
	public Meal() {
		// TODO Auto-generated constructor stub
		System.out.println("Meal class's constructor.");
	}
	public float getCost(){
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	public void showItems(){
		for (Item item : items) {
			System.out.println("item'name : " + item.getName());
			System.out.println("item's price : " + item.price());
			System.out.println("item's packing : " + item.packing().pack());
		}
	}
	

}
