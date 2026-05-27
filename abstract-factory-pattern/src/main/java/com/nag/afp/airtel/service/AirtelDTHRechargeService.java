package com.nag.afp.airtel.service;

import java.util.Arrays;
import java.util.List;

import com.nag.afp.service.DTHRechargeService;

public class AirtelDTHRechargeService implements DTHRechargeService{

	@Override
	public List<String> getDTHPackages() {

		return Arrays.asList(new String[] {"AIRTEL-SPORT-349","AIRTEL-MUSIC-99"});
	}

}
