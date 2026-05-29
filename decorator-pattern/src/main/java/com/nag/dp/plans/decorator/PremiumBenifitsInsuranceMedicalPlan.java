package com.nag.dp.plans.decorator;

import java.util.Arrays;
import java.util.List;

import com.nag.dp.plans.MedicalInsurancePlan;

public class PremiumBenifitsInsuranceMedicalPlan extends MedicalInsurancePlan {

	private MedicalInsurancePlan medicalInsurancePlan;

	public PremiumBenifitsInsuranceMedicalPlan(MedicalInsurancePlan medicalInsurancePlan) {
		super("Premium" +medicalInsurancePlan.getPlnaName() ,"Premium");
		this.medicalInsurancePlan=medicalInsurancePlan;
	}

	@Override
	public List<String> planBenifits() {
        List<String> planBenifits= null;
         planBenifits= medicalInsurancePlan.planBenifits();
         planBenifits.add("Dental coverage");
         planBenifits.add("no pre approval for hospitalization");
        
		return planBenifits;
	}

	@Override
	public List<String> networkCoverage() {

		return Arrays.asList(new String[] {"all hospital in metroplitan city"});
	}

	     
}
