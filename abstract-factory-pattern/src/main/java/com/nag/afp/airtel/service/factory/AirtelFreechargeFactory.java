package com.nag.afp.airtel.service.factory;

import com.nag.afp.airtel.service.AirtelDTHRechargeService;
import com.nag.afp.airtel.service.AirtelPostPaidMobileRechargeService;
import com.nag.afp.airtel.service.AirtelPrepaidMobileRechargeService;
import com.nag.afp.service.DTHRechargeService;
import com.nag.afp.service.MobileRechargeService;
import com.nag.afp.service.factory.FreechrageFactory;

public class AirtelFreechargeFactory extends FreechrageFactory {

	@Override
	public MobileRechargeService newMobileRechargeService(String rechargeType) {

		 MobileRechargeService mobileRechargeService= null;
		 if(rechargeType.equals("prepaid")) {
			 mobileRechargeService= new AirtelPrepaidMobileRechargeService();
		 }else if(rechargeType.equals("postpaid")) {
			 mobileRechargeService=new AirtelPostPaidMobileRechargeService();
		 }
		 
		return mobileRechargeService;
	}

	@Override
	public DTHRechargeService newDthRechargeService() {

		return new AirtelDTHRechargeService();
	}

}
