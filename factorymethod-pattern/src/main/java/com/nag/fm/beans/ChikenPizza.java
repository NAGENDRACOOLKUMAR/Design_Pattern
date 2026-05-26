package com.nag.fm.beans;

public class ChikenPizza implements Pizza {

	@Override
	public void prepareDough() {
		System.out.println("preparing a  little hard dough for the chicken pizza");
	}

	@Override
	public void bake() {
		System.out.println("applying the chicken base ");
		System.out.println("putting the chicken");
		System.out.println("hitting at the temperature of 200 degree ");
	}

	@Override
	public void box() {
		System.out.println("cutting the chicken pizza and putting in the red box");
	}

}
