package com.nag.bp.api;

import java.io.IOException;
import java.util.Properties;

import com.nag.bp.api.builder.TruckBuilder;

public abstract class Truck {

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
	
	public Truck(String registrationNO, String engineNo, String chasisNo) {
		this.registrationNO = registrationNO;
		this.engineNo = engineNo;
		this.chasisNo = chasisNo;
	}

	public static TruckBuilder newBuilder(String registrationNo, String engineNo, String chasisNo) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		 TruckBuilder truckBuilder = null;
		 String buildeImplClass = null;
		 Properties prop = null;
		  prop = new Properties();
		  Class<?> cls = null;
		  
		  prop.load(Truck.class.getClassLoader().getResourceAsStream("env.properties"));
		  buildeImplClass = prop.getProperty("com.nag.bp.api.builder");
		  cls =Class.forName(buildeImplClass);
		  truckBuilder = (TruckBuilder) cls.newInstance();
		  
		return  truckBuilder.registrationNO(registrationNo).chasisNo(chasisNo).engineNo(engineNo);
		  
		 
		 
	}
	
	
	
	
	public String getRegistrationNO() {
		return registrationNO;
	}

	public void setRegistrationNO(String registrationNO) {
		this.registrationNO = registrationNO;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public int getCubicCapicity() {
		return cubicCapicity;
	}

	public void setCubicCapicity(int cubicCapicity) {
		this.cubicCapicity = cubicCapicity;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public String getPermitType() {
		return permitType;
	}

	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
		
}
