package com.nag.fp2.pattern;

import com.nag.fp2.beans.CorporateAndPersonalLoanManager;
import com.nag.fp2.beans.HomeLoanManager;
import com.nag.fp2.beans.LoanManager;
import com.nag.fp2.beans.PersonalLoanManager;

public class LoanManagerFactory {

	private String propertyType;
	private String occupation;
	private String city; 
	private double grossAnualIncome;
	private String orginazation;
	
	public LoanManager createLoanManager(String loanType) {
		LoanManager loanManager = null;
		if(loanType.equals("home")) {
			loanManager = new HomeLoanManager(propertyType, city);
		} else if (loanType.equals("personal")) {
			if(orginazation != null) {
			    loanManager = new CorporateAndPersonalLoanManager(occupation, grossAnualIncome, orginazation);

			} else {
			loanManager = new CorporateAndPersonalLoanManager(occupation, grossAnualIncome);
			}
		}
		return loanManager;
	}
	
	
	public String getOrginazation() {
		return orginazation;
	}


	public void setOrginazation(String orginazation) {
		this.orginazation = orginazation;
	}


	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getGrossAnualIncome() {
		return grossAnualIncome;
	}
	public void setGrossAnualIncome(double grossAnualIncome) {
		this.grossAnualIncome = grossAnualIncome;
	}
	
	
}
