package com.canddella.entity;

import java.time.LocalDate;

public abstract class SavingsAccount extends Account {
	
	private double minimumBalance;
	private boolean freeAtm;
	
	

	public SavingsAccount(String accountNo, String accountType, LocalDate accountCreateDate, double accountBalance) {
		super(accountNo, accountType, accountCreateDate, accountBalance);
		// TODO Auto-generated constructor stub
	}


	public double getMinimumBalance() {
		return minimumBalance;
	}



	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}



	public boolean isFreeAtm() {
		return freeAtm;
	}




	public void setFreeAtm(boolean freeAtm) {
		this.freeAtm = freeAtm;
	}


	
	
	
	
	

	
}
