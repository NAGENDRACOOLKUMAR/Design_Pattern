package com.nag.afp.airtel.service;

import java.util.Arrays;
import java.util.List;

import com.nag.afp.service.MobileRechargeService;

public class AirtelPostPaidMobileRechargeService implements MobileRechargeService{

	@Override
	public List<String> getDataPlan() {

		return Arrays.asList(new String[] {"AIRTEL-POSTPAID-199","AIRTEL-POSTPAID-399"});
	}

}
