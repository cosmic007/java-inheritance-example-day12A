package com.canddella.entity;

import java.time.LocalDate;

public class RuralAccount extends SavingsAccount {

	

	public RuralAccount(String accountNo, String accountType, LocalDate accountCreateDate, double accountBalance) {
		super(accountNo, accountType, accountCreateDate, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAccountMinimumBalance() {
		
		
		setMinimumBalance(100);
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void getATMDetails() {
		
		
		setFreeAtm(true);
		
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	

}
