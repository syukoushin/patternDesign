package buiderDesignPattern.builder;

import java.util.ArrayList;
import java.util.List;

import buiderDesignPattern.food.Meal;
import buiderDesignPattern.impl.ChickenBurger;
import buiderDesignPattern.impl.Coke;
import buiderDesignPattern.impl.Persi;
import buiderDesignPattern.impl.VegBurger;
import buiderDesignPattern.interfaces.Item;

public class MealBuilder {
	
	public Meal packageOne(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal packageTwo(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Persi());
		return meal;
	}
	
	public Meal customePackage(String[] strItem){
		return custom(this.getItemList(strItem));
	}
	
	private Meal custom(List<Item> items){
		Meal meal = new Meal();
		for (Item item : items) {
			meal.addItem(item);
		}
		return meal;
	}
	
	private List<Item> getItemList(String[] strItem){
		List<Item> itemList = new ArrayList<>();
		for (int i = 0; i < strItem.length; i++) {
			String clazzName = strItem[i];
			try {
				Class clazz = Class.forName("impl."+clazzName);
				Object item = clazz.newInstance();
				itemList.add((Item) item);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println("There is no class named " + clazzName);
				e.printStackTrace();
				continue;
			}
		}
		return itemList;
		
	}
}
