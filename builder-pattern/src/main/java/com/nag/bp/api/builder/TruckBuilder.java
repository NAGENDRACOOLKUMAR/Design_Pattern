package com.nag.bp.api.builder;

import com.nag.bp.api.Truck;

public abstract class TruckBuilder {

	protected String registrationNO;
	protected String engineNo;
	protected String chasisNo;
	protected String color;
	protected int capacity;
	protected  String modelNo;
	protected int cubicCapicity;
	protected  int  tyre;
	protected String permitType;
	protected String manufacturer;
	
	public abstract Truck build();

	public String registrationNO() {
		return registrationNO;
	}

	public TruckBuilder registrationNO(String registrationNO) {
		this.registrationNO = registrationNO;
		return this;
	}

	public String engineNo() {
		return engineNo;
	}

	public TruckBuilder engineNo(String engineNo) {
		this.engineNo = engineNo;
		return this;
	}

	public String chasisNo() {
		return chasisNo;
	}

	public TruckBuilder chasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
		return this;
	}

	public String color() {
		return color;
	}

	public TruckBuilder color(String color) {
		this.color = color;
		return this;
	}

	public int capacity() {
		return capacity;
	}

	public TruckBuilder capacity(int capacity) {
		this.capacity = capacity;
		return this;
	}

	public String modelNo() {
		return modelNo;
	}

	public TruckBuilder modelNo(String modelNo) {
		this.modelNo = modelNo;
		return this;
	}

	public int cubicCapicity() {
		return cubicCapicity;
	}

	public TruckBuilder cubicCapicity(int cubicCapicity) {
		this.cubicCapicity = cubicCapicity;
		return this;
	}

	public int tyres() {
		return tyre;
	}

	public TruckBuilder tyre(int tyre) {
		this.tyre = tyre;
		return this;
	}

	public String permitType() {
		return permitType;
	}

	public TruckBuilder permitType(String permitType) {
		this.permitType = permitType;
		return this;
	}

	public String manufacturer() {
		return manufacturer;
	}

	public TruckBuilder manufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}
	
	
	
	
	
}
