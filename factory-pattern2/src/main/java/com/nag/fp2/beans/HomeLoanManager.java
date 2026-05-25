package com.nag.fp2.beans;

public class HomeLoanManager implements LoanManager{

	private String propertyType;
	private String city;
	
	
	public HomeLoanManager(String propertyType, String city) {
		this.propertyType = propertyType;
		this.city = city;
	}


	@Override
	public double applicableInterestRate(double principle, long tenure) {
         if(propertyType.equals("independent home")) {
        	 return 7.5;
         }
		return 8.5;
	}

}
