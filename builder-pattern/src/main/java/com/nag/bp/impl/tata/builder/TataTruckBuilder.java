package com.nag.bp.impl.tata.builder;

import com.nag.bp.api.Truck;
import com.nag.bp.api.builder.TruckBuilder;
import com.nag.bp.impl.tata.TataDumperTruck;

public class TataTruckBuilder extends TruckBuilder {

	@Override
	public Truck build() {
     Truck truck = null;
     
       truck = new TataDumperTruck(registrationNO, engineNo, chasisNo);
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
