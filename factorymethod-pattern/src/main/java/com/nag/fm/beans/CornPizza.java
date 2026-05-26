package com.nag.fm.beans;

public class CornPizza implements Pizza{

	@Override
	public void prepareDough() {
		System.out.println("preparing the medium hard for the corn pizza");
	}

	@Override
	public void bake() {
		System.out.println("applying the base for the corn");
		System.out.println("hitting at the temperature of 130 degree");
	}

	@Override
	public void box() {
		System.out.println("cutting the corn pizza and putting in green box");
	}

}
