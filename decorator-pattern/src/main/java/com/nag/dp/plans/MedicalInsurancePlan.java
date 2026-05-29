package com.nag.dp.plans;

import java.util.List;

public abstract class MedicalInsurancePlan {

	protected String plnaName;
	protected String planType;
	
	
	 public String getPlnaName() {
		return plnaName;
	}
	public void setPlnaName(String plnaName) {
		this.plnaName = plnaName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	
	 public MedicalInsurancePlan(String plnaName, String planType) {
		super();
		this.plnaName = plnaName;
		this.planType = planType;
	}
	 public abstract List<String> planBenifits();
     public  abstract List<String> networkCoverage();
	
}
