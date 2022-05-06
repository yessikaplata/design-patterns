package com.review.design_patterns.Facade.subsystem;

public class Account {

	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean lockAccount() {
		System.out.println("Account locked");
		return true;
	}

	public boolean unLockAccount() {
		System.out.println("Account unlocked");
		return true;
	}

	public boolean withdrawMoney(double amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		System.out.println("Insufficient balance");
		return false;

	}
}
