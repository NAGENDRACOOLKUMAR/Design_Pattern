package com.nag.ap.test;

import java.io.IOException;

import com.nag.ap.beans.RetailStore;

public class ApTest {

	public static void main(String[] args) throws IOException {

		RetailStore retailStore = new RetailStore();
		
	double marketPrice = retailStore.buyOrnamentalGold(10);
	double sellPrice = retailStore.sellOrnamentalGold(10);
	
	System.out.println( "10 gram gold market price is : "+marketPrice);
	System.out.println( "10 gram gold selling price is :"+sellPrice);
		
	}

}
