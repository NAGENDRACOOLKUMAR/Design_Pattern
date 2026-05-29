package com.nag.dp.test;

import com.nag.dp.plans.MaxBuppaMedicalInsurancePlan;
import com.nag.dp.plans.SurakshaMedicalInsurancePlan;
import com.nag.dp.plans.decorator.PremiumBenifitsInsuranceMedicalPlan;

public class DecoratorPTest {
    public static void main(String[] args) {
    	
    	PremiumBenifitsInsuranceMedicalPlan plan = new PremiumBenifitsInsuranceMedicalPlan(
    			new MaxBuppaMedicalInsurancePlan());
    	
    	System.out.println("plan name:"+plan.getPlnaName());
    	System.out.println("plna type:"+plan.getPlanType());
    	System.out.println("plan benefits:" +plan.planBenifits());
    	System.out.println("coverage network:"+plan.networkCoverage());
    	
    }
	
}
