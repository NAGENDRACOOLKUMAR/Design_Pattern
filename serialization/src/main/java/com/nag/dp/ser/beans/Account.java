package com.nag.dp.ser.beans;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID= 5308756301834224665l;
	
	private int accountNo;
	private String accountHolderName;
	private String accountType;
	private double balance;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
	
}
