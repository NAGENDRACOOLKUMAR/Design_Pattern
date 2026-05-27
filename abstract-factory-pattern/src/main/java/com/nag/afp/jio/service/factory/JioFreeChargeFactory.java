package com.nag.afp.jio.service.factory;


import com.nag.afp.jio.service.JioDTHRechargeService;
import com.nag.afp.jio.service.JioPrepaidMobileRechargeService;
import com.nag.afp.jio.service.jioPostPaidMobileRechargeService;
import com.nag.afp.service.DTHRechargeService;
import com.nag.afp.service.MobileRechargeService;
import com.nag.afp.service.factory.FreechrageFactory;

public class JioFreeChargeFactory extends FreechrageFactory {

	@Override
	public MobileRechargeService newMobileRechargeService(String rechargeType) {

		MobileRechargeService mobileRechargeService= null;
		 if(rechargeType.equals("prepaid")) {
			 mobileRechargeService= new JioPrepaidMobileRechargeService();
		 }else if(rechargeType.equals("postpaid")) {
			 mobileRechargeService=new jioPostPaidMobileRechargeService();
		 }
		 
		return mobileRechargeService;
	}

	@Override
	public DTHRechargeService newDthRechargeService() {

		return new JioDTHRechargeService();
	}

}
