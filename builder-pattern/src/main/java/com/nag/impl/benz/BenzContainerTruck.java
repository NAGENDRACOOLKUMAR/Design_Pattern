package com.nag.impl.benz;

import com.nag.bp.api.Truck;

public class BenzContainerTruck extends Truck{

	protected long length;
	protected long width;
	
	public BenzContainerTruck(String registrationNO, String engineNo, String chasisNo) {
		super(registrationNO, engineNo, chasisNo);
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "BenzContainerTruck [length=" + length + ", width=" + width + ", registrationNO=" + registrationNO
				+ ", engineNo=" + engineNo + ", chasisNo=" + chasisNo + ", color=" + color + ", capacity=" + capacity
				+ ", modelNo=" + modelNo + ", cubicCapicity=" + cubicCapicity + ", tyre=" + tyre + ", permitType="
				+ permitType + ", manufacturer=" + manufacturer + "]";
	}

	
}
