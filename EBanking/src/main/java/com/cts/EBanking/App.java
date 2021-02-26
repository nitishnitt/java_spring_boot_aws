package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	// static BankAccount b=(BankAccount)ctx.getBean("bankAccount");
	static SmartBankAccount sbf = (SmartBankAccount) ctx.getBean("smartBankAccount");

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Welcome Mr/Ms: " + sbf.getName());
		System.out.println("Your customer id is :" + sbf.getCustomerId());
		System.out.println("Please select the account type \n1 " + sbf.getAccounts().get(0) + " \n2 "
				+ sbf.getAccounts().get(1) + " \n3 " + sbf.getAccounts().get(2));

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("Enter amount to be deposited");
				double a=scanner.nextDouble();
				System.out.println("Your balance amount is "+sbf.doDeposit(a));
			} else if (choice == 2) {
				System.out.println("Enter amount to be withdrawn");
				double a=scanner.nextDouble();
				System.out.println("Your balance amount is "+sbf.doWithdraw(a));				

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			double amt=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int t=scanner.nextInt();
			//SmartBankAccount sbf=(SmartBankAccount)ctx.getBean("smartBankAccount");
			System.out.println("Your balance after "+t+" months will be "+sbf.calculateRecurringAccount(amt,t));
			break;
		case 3:
			System.out.println("Enter FD amount");
			double a=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int t2=scanner.nextInt();
			
			System.out.println("Your balance after "+t2+" months will be "+sbf.calculateFixedAccount(a,t2));
			break;
			

		default:
			System.out.println("Wrong Choice");

		}

	}
}
