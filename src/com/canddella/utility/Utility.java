package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Welcome to ABC Bank\n********************");
		
		
		
		
		System.out.println("\n1.Salary Account\n2.Rural Account");
		int choice=scanner.nextInt();
		Account account=null;
		
		switch(choice)
		{
		case 1:
			account=Service.createAccount(choice);
			Service.displayDetails(account);
			break;
			
		case 2:
			account=Service.createAccount(choice);
			Service.displayDetails(account);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		
		}
		
			
			
			
	

	}

}
