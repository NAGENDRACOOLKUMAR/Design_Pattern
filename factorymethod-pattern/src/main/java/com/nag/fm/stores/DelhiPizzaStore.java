package com.nag.fm.stores;

import com.nag.fm.beans.Pizza;
import com.nag.fm.pattern.DelhiPizzaFactory;
import com.nag.fm.pattern.PizzaFactory;

public class DelhiPizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = null;
		PizzaFactory pizzaFactory =null;
		
		pizzaFactory  = new DelhiPizzaFactory();
		pizza =pizzaFactory.newPizza(pizzaType);
		
		return pizza;
		
	}
	
}
