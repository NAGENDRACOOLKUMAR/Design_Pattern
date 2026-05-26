package com.nag.fm.pattern;

import com.nag.fm.beans.ChikenPizza;
import com.nag.fm.beans.Pizza;
import com.nag.fm.beans.VegPizza;

public class DelhiPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(String pizzaType) {

		Pizza pizza = null;
		System.out.println("Delhi pizza factory is creating pizza");
		if(pizzaType.equals("veg")) {
			pizza = new VegPizza();
		}else if (pizzaType.equals("Chicken")) {
			pizza = new ChikenPizza();
		}
		return pizza;
	}

	
}
