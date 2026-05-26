package com.nag.fm.test;

import com.nag.fm.beans.Pizza;
import com.nag.fm.stores.PatnaPizzaStore;

public class FactoryMethodTest {

	public static void main(String[] args) {

		PatnaPizzaStore patnaPizzaStore = new PatnaPizzaStore();
		Pizza pizza = patnaPizzaStore.orderPizza("corn");
		System.out.println("pizza :"+ pizza.getClass().getName());
	}

}
