package com.nag.fp2.beans;

public class PersonalLoanManager implements LoanManager {

	private String occupation;
	private double grossAnualIncome;
	
	
	public PersonalLoanManager(String occupation, double grossAnualIncome) {
		
		this.occupation = occupation;
		this.grossAnualIncome = grossAnualIncome;
	}


	@Override
	public double applicableInterestRate(double principle, long tenure) {
         if(occupation.equals("salary") && grossAnualIncome > 150000) {
        	 return 13.85;
         }
		return 15.75;
	}

}
