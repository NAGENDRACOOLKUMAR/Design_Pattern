package com.nag.fm.pattern;

import com.nag.fm.beans.ChikenPizza;
import com.nag.fm.beans.CornPizza;
import com.nag.fm.beans.Pizza;

public class PatnaPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(String pizzaType) {

		Pizza pizza = null;
		System.out.println("patna factory is creating pizza ");
		if(pizzaType.equals("chicken")) {
			pizza = new ChikenPizza();
		} else if(pizzaType.equals("corn")) {
			pizza = new CornPizza();
		}
		return pizza;
	}

	
}
