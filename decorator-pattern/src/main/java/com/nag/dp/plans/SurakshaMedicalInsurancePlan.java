package com.nag.dp.plans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurakshaMedicalInsurancePlan  extends MedicalInsurancePlan{

	public SurakshaMedicalInsurancePlan() {
		super("suraksha", "general");

	}

	@Override
	public List<String> planBenifits() {
		// fetch benifits on plan name and plan type from the  database and return.
		List<String> planBenifits =new ArrayList<String>();
		 planBenifits.addAll(Arrays.asList(new String[] {"lower copay,within 24 hours of claim settalment"}));
	
		 return planBenifits;
	}

	@Override
	public List<String> networkCoverage() {

		return Arrays.asList(new String[] {"Applo", "medanta"});
	}

}
