package com.nag.fm.pattern;

import com.nag.fm.beans.Pizza;

public abstract class PizzaFactory {

	 final public  Pizza newPizza(String pizzaType) {
		Pizza pizza = null;
		
		 pizza = createPizza(pizzaType);
		 System.out.println("applying standard process in creating pizzas");
		 pizza.prepareDough();
		 pizza.bake();
		 pizza.box();
		
		return pizza;
	}
	
	// factory don't know the how to create the pizza 
	
	abstract protected Pizza createPizza(String pizzaType);
}
