package com.cts.SpringAopDemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {
		this.balance+=amount;
		System.out.println("Your balance is "+this.balance);
		
	}

	public void doWithdraw(int amount) {

		if(amount<=balance) {
			this.balance-=amount;
			System.out.println("You have successfully withdrawn "+amount);
		}
		else
			System.out.println("Insufficient funds");

	}

	public void doChangePin(int oldPin, int pin) throws Exception {

		if(oldPin==this.pinCode && pin>999 && pin<=9999) {
			this.pinCode=pin;
		}else
			throw new Exception();
	}

	public void showBalance() {

		System.out.println("Your balance is "+this.balance);
		
	}

}
