package com.nag.fm.beans;

public class VegPizza implements Pizza {

	@Override
	public void prepareDough() {
		System.out.println("preparing soft and thin dough for veg pizza");
	}

	@Override
	public void bake() {
		System.out.println("putting vegtable and baking");
	}

	@Override
	public void box() {
		System.out.println("cutting veg pizza and placed in green box");
	}

}
