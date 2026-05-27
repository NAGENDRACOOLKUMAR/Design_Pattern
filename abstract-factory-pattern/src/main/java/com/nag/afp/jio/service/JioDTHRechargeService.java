package com.nag.afp.jio.service;

import java.util.Arrays;
import java.util.List;

import com.nag.afp.service.DTHRechargeService;
import com.nag.afp.service.MobileRechargeService;

public class JioDTHRechargeService implements DTHRechargeService {

	@Override
	public List<String> getDTHPackages() {

		return Arrays.asList(new String[] {"JIO-SPORT-349","JIO-MUSIC-99"});

	}

	

}
