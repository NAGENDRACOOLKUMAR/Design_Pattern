package com.nag.fp2.test;

import com.nag.fp2.beans.LoanEstimater;

public class FactoryPattern2Test {
 public static void main(String[] args) {
	 LoanEstimater loanEstimater = new LoanEstimater();
	 loanEstimater.estimateInterestAmountForPersonalLoan("open-ai", 2000000, 60000, 36, "google"  );
	 loanEstimater.estimateInterestAmountForHomeLoan("independent","Delhi", 80000, 13);
 }
}
