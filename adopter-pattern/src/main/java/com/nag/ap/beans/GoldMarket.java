package com.nag.ap.beans;

import java.io.IOException;
import java.util.Properties;

public class GoldMarket {
	Properties prop = null;
	
	public GoldMarket() throws IOException {
		prop = new Properties();
		prop.load(this.getClass().getClassLoader().getResourceAsStream("goldmarket.properties"));
		
	}
	
	public double goldMarketPrice() throws IOException {
		
		double marketPrice=0;
		marketPrice = Double.parseDouble(prop.getProperty("gold.price"));
		
		return marketPrice;
		
	}
	
	 public double buy(double quantity) {
		 
		 double marketPrice =0;
		 double perGramPrice =0;
		 
		 marketPrice =Double.parseDouble(prop.getProperty("gold.price"));
		 perGramPrice = marketPrice/10.0;
		 return quantity*perGramPrice;
	 }
	 
	 public double sell(double quantity) {
		
		 double marketPrice = 0 ;
		 double perGramPrice = 0;
		 double valuationAmount=0;
		 double finalExchangeAmount=0;
		 double wastageCharge=0;
		 
		 marketPrice =Double.parseDouble(prop.getProperty("gold.price"));

		 wastageCharge =Double.parseDouble(prop.getProperty("wastage.charge"));
		 perGramPrice = marketPrice/10.0;
		 valuationAmount =quantity*perGramPrice;
		 
		 finalExchangeAmount= valuationAmount- (valuationAmount * (wastageCharge /100));
		 
		 return finalExchangeAmount;
		 
	 }
}
