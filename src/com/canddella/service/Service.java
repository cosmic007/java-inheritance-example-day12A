package com.canddella.service;

import java.time.LocalDate;

import com.canddella.entity.Account;
import com.canddella.entity.RuralAccount;
import com.canddella.entity.SalaryAccount;

public class Service {

	public static Account createAccount(int choice) {
		
		
		Account account=null;
		switch(choice)
		{
		case 1:
			account=new SalaryAccount("SALA123","Salary Account",LocalDate.now(),7000);
			break;
		case 2:
			account=new RuralAccount("RA123","Rural Account",LocalDate.now(),1000);
			break;
		default:
			System.out.println("Invalid choice");
		}
		return account;
		
	}

	public static void displayDetails(Account account) {
		
		System.out.println("Savings Account Details\n---------------------------------");
		
		if(account instanceof SalaryAccount)
		{
			
			
			SalaryAccount salaryAccount = (SalaryAccount) account;
			
			salaryAccount.getAccountMinimumBalance();
			salaryAccount.getATMDetails();
			
			System.out.println("Account No:"+salaryAccount.getAccountNo()+"\nAccountType:"+salaryAccount.getAccountType()+"\nAccountCreateDate:"+salaryAccount.getAccountCreateDate()+"\nAccountBalance:"+salaryAccount.getAccountBalance());
			
			System.out.println("--------------------------------------");
			System.out.println("Your Account Minimum Balance should be:"+salaryAccount.getMinimumBalance());
			if(salaryAccount.isFreeAtm())
			{
				System.out.println("You have FREE ATM Card!!!!!!!!!!!!!");
				
			}
			else
			{
				System.out.println("No Free ATM Card available");
			}
			System.out.println("------------------Have a Nice Day------------------");
			
		}
		else if(account instanceof RuralAccount)
		{
            RuralAccount ruralAccount = (RuralAccount) account;
			
            ruralAccount.getAccountMinimumBalance();
            ruralAccount.getATMDetails();
			
			System.out.println("Account No:"+ruralAccount.getAccountNo()+"\nAccountType:"+ruralAccount.getAccountType()+"\nAccountCreateDate:"+ruralAccount.getAccountCreateDate()+"\nAccountBalance:"+ruralAccount.getAccountBalance());
			
			System.out.println("--------------------------------------");
			System.out.println("Your Account Minimum Balance should be:"+ruralAccount.getMinimumBalance());
			if(ruralAccount.isFreeAtm())
			{
				System.out.println("You have FREE ATM Card!!!!!!!!!!!!!");
				
			}
			else
			{
				System.out.println("No Free ATM Card available");
			}
			System.out.println("------------------Have a Nice Day------------------");
			
			
		}
		
	}

}
