package com.nag.afp.jio.service;

import java.util.Arrays;
import java.util.List;

import com.nag.afp.service.MobileRechargeService;

public class JioPrepaidMobileRechargeService implements MobileRechargeService{

	@Override
	public List<String> getDataPlan() {

		return Arrays.asList(new String[] {"JIO-399", "JIO-599", "JIO-999"});
	}

	

}
