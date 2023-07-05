package com.canddella.entity;

import java.time.LocalDate;

public class SalaryAccount extends SavingsAccount {
	
	
	

	

	public SalaryAccount(String accountNo, String accountType, LocalDate accountCreateDate, double accountBalance) {
		super(accountNo, accountType, accountCreateDate, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public void getAccountMinimumBalance() {
		
		setMinimumBalance(5000);
		
	}

	@Override
	public void getATMDetails() {
		
		setFreeAtm(false);
		
	
	}
	
	
	
}
