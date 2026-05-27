package com.nag.bp.test;

import java.io.IOException;

import com.nag.bp.api.Truck;

public class BPTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

		Truck truck =Truck.newBuilder("jH 10 3797","E7658i95" , "C8766").color("red")
				.capacity(787).cubicCapicity(500000).modelNo("model 546").manufacturer("Benz")
		        .permitType("All india").tyre(20).build();
		
		System.out.println(truck);
	}

}
