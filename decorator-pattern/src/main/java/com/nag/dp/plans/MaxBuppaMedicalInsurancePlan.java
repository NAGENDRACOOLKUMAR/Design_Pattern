package com.nag.dp.plans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxBuppaMedicalInsurancePlan extends MedicalInsurancePlan{

	public MaxBuppaMedicalInsurancePlan() {
		super("max bupa", "general plan ");
		
	}

	@Override
	
	public List<String> planBenifits() {
		// 
	
		List<String> planBenifits =new ArrayList<String>();
		 planBenifits.addAll(Arrays.asList(new String[] {"lower copay","within 72 of claim settlement","cashless facility in network hospital"}));
	
		 return planBenifits;
	}

	@Override
	public List<String> networkCoverage() {
		return Arrays.asList(new String[] {"Max hospital","Appolo hospital","medanta hospital"});
	}

}
