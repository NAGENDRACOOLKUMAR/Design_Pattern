package com.nag.afp.airtel.service;

import java.util.Arrays;
import java.util.List;

import com.nag.afp.service.MobileRechargeService;

public class AirtelPrepaidMobileRechargeService implements MobileRechargeService {

	@Override
	public List<String> getDataPlan() {

		return Arrays.asList(new String[] {"AIRTEL-399", "AIRTEL-599", "AIRTEL-999"});
	}

}
