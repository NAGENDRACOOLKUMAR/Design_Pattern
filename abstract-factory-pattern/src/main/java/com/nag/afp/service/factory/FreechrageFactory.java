package com.nag.afp.service.factory;

import java.io.IOException;
import java.util.Properties;

import com.nag.afp.service.DTHRechargeService;
import com.nag.afp.service.MobileRechargeService;

public abstract class FreechrageFactory {

	public static FreechrageFactory newInstance() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		FreechrageFactory freechrageFactory =null;
		
		 Properties prop =null;
		 String factoryClass= null;
		 
		 prop = new Properties();
		 prop.load(FreechrageFactory.class.getClassLoader().getResourceAsStream("freecharge.properties"));
		factoryClass=prop.getProperty("com.nag.afp.service.FreeChargeFactory");
		 
		freechrageFactory =(FreechrageFactory) Class.forName(factoryClass).newInstance();
		
		return freechrageFactory;
		
		
	}
 public	abstract MobileRechargeService newMobileRechargeService(String rechargeType);
	
 public	abstract DTHRechargeService newDthRechargeService();
}
