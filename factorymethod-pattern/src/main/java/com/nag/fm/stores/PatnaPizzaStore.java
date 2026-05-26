package com.nag.fm.stores;

import com.nag.fm.beans.Pizza;
import com.nag.fm.pattern.PatnaPizzaFactory;
import com.nag.fm.pattern.PizzaFactory;

public class PatnaPizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = null;
		PizzaFactory pizzaFactory =null;
		
		pizzaFactory  = new PatnaPizzaFactory();
		pizza =pizzaFactory.newPizza(pizzaType);
		
		return pizza;
	}		
}
