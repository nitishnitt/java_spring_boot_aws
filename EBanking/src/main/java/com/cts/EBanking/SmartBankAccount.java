package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;


public class SmartBankAccount extends BankAccount {
	DecimalFormat df=new DecimalFormat("0.00");
	SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		/*
		 * p=10000, r=10%=0.1, n=12, t=60
		 *  result = 10000*((1+( o.10)/12)12*(60/12))
		 * :A=P(1 + r/n)nt
		 */
		if (amount > 9999 && amount < 1000001 && months > 0 && months < 121) {
			double totalAmount = amount * Math.pow((1 + (0.1 / 12)), months);
			return Double.parseDouble(df.format(totalAmount));
		}
		return -1;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		//(P*n)+(P(n(n+1)/(2*12))*(r/100))
		if (amount > 999 && amount < 50001 && months > 0 && months < 61) {
			double totalAmount = (amount * months) + (amount * (months * (months + 1) / 24.0) * 0.07);
			return Double.parseDouble(df.format(totalAmount));
		}
		return -1;
	}

}
