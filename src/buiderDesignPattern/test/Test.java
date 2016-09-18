package buiderDesignPattern.test;

import buiderDesignPattern.builder.MealBuilder;
import buiderDesignPattern.food.Meal;

public class Test {

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
//		Meal meal = builder.packageOne();
//		meal.showItems();
//		System.out.println("Total coat is " + meal.getCost());
		String[] strItem ={"Coke","ChickenBurger"};
		Meal customMeal = builder.customePackage(strItem);
		customMeal.showItems();
		System.out.println("Total coat is " + customMeal.getCost());
		
	}
}
