package com.nag.fp2.beans;

import java.util.Optional;

import com.nag.fp2.pattern.LoanManagerFactory;

public class LoanEstimater {

	private LoanManager loanManager;
	
	public void  estimateInterestAmountForHomeLoan(String propertyType, String city,
			double principleAmount, long tenure) {
		
		  double applicableInterestRate=0;
		  double interestAmountToBePaid=0;
		  
		  LoanManagerFactory loanManagerFactory =null;
		  
		   loanManagerFactory= new LoanManagerFactory();
		   loanManagerFactory.setPropertyType(propertyType);
		   loanManagerFactory.setCity(city);
		   
		   loanManager = loanManagerFactory.createLoanManager("home");
		   applicableInterestRate = loanManager.applicableInterestRate(principleAmount, tenure);
		   interestAmountToBePaid =(principleAmount * (tenure/12) * applicableInterestRate)/100;
		   
		   System.out.println("interest amount to be paid for home loan :" +interestAmountToBePaid);
	}	
	
	public void estimateInterestAmountForPersonalLoan(String occupation, double grsossAnualIncome,
			double principleAmount, long tenure, String orginazation) {
		
		  double applicableInterestRate=0;
		  double interestAmountToBePaid=0;
		  
		  LoanManagerFactory loanManagerFactory =null;
		  
		   loanManagerFactory= new LoanManagerFactory();
		   loanManagerFactory.setOccupation(occupation);
		   loanManagerFactory.setGrossAnualIncome(grsossAnualIncome);
		   
		   if(orginazation != null) {
			   loanManagerFactory.setOrginazation(orginazation);
		   }
		   
		   loanManager = loanManagerFactory.createLoanManager("personal");
		   applicableInterestRate = loanManager.applicableInterestRate(principleAmount, tenure);
		   interestAmountToBePaid =(principleAmount * (tenure/12) * applicableInterestRate)/100;
		   
		   System.out.println("interest amount to be paid for personal loan :" +interestAmountToBePaid);
		  
		
	}
}
