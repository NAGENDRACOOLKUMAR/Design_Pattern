package com.nag.bp.impl.benz.builder;

import com.nag.bp.api.Truck;
import com.nag.bp.api.builder.TruckBuilder;
import com.nag.impl.benz.BenzContainerTruck;

public class BenzTruckBuilder extends TruckBuilder {

	@Override
	public Truck build() {
		Truck truck = null;
	     
	       truck = new BenzContainerTruck(registrationNO, engineNo, chasisNo);
	        truck.setCapacity(capacity);
	        truck.setColor(color);
	        truck.setCubicCapicity(cubicCapicity);
	        truck.setManufacturer(manufacturer);
	        truck.setModelNo(modelNo);
	        truck.setTyre(tyre);
	        truck.setPermitType(permitType);
			
			return truck;
		
		
		
	}

}
