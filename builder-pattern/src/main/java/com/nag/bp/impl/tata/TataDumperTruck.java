package com.nag.bp.impl.tata;

import com.nag.bp.api.Truck;

public class TataDumperTruck extends Truck {
	
	protected double maxWeight;
	

	public TataDumperTruck(String registrationNO, String engineNo, String chasisNo) {
		super(registrationNO, engineNo, chasisNo);
	}


	public double getMaxWeight() {
		return maxWeight;
	}


	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}


	@Override
	public String toString() {
		return "TataTruck [maxWeight=" + maxWeight + ", registrationNO=" + registrationNO + ", engineNo=" + engineNo
				+ ", chasisNo=" + chasisNo + ", color=" + color + ", capacity=" + capacity + ", modelNo=" + modelNo
				+ ", cubicCapicity=" + cubicCapicity + ", tyre=" + tyre + ", permitType=" + permitType
				+ ", manufacturer=" + manufacturer + "]";
	}
	
	
	
	

}
