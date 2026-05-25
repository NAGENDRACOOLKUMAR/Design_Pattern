package com.nag.fp2.beans;

public class CorporateAndPersonalLoanManager implements LoanManager{

	private String occupation;
	private double grossAnualIncome;
	private String orginazation;
	
	
	public CorporateAndPersonalLoanManager(String occupation, double grossAnualIncome, String orginazation) {
		this.occupation = occupation;
		this.grossAnualIncome = grossAnualIncome;
		this.orginazation = orginazation;
	}
	


	public CorporateAndPersonalLoanManager(String occupation, double grossAnualIncome) {
		this.occupation = occupation;
		this.grossAnualIncome = grossAnualIncome;
	}



	@Override
	public double applicableInterestRate(double principle, long tenure) {
         if(occupation.equals("salary") && grossAnualIncome > 150000) {
        	 if(orginazation.equals("amazon")) {
        		 return 10.5;
        	 }
        	 return 13.85;
         }
		return 15.75;
	}
}
