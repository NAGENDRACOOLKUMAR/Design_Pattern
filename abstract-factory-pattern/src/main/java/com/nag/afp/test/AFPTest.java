package com.nag.afp.test;

import java.io.IOException;
import java.util.List;

import com.nag.afp.service.MobileRechargeService;
import com.nag.afp.service.factory.FreechrageFactory;

public class AFPTest {

	public static void main(String[] args) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

		FreechrageFactory freechrageFactory =FreechrageFactory.newInstance();
		
		MobileRechargeService mobileRechargeService =freechrageFactory.newMobileRechargeService("prepaid");
	
		List<String> dataPlans =mobileRechargeService.getDataPlan();
		
		dataPlans.stream().forEach(System.out::println);
	}

}
