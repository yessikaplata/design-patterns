package com.review.design_patterns.Facade.subsystem;

public class Authentication {
	
	private Account account;
	
	public boolean readCard() {
		System.out.println("Card was readed");
		return true;
	}

	public String enterPassword() {
		System.out.println("Password was entered");
		return "1234";
	}

	public boolean validatePassword(String password) {
		System.out.println("Password is correct");
		return true;
	}

	public Account getAccount() {
		System.out.println("Account was searched");
		account = new Account(500);
		return account;
	}

	public void doOnFailReadCard() {
		System.out.println("Card could not be read.");
	}
	
	public void doOnFailValidatePassword() {
		System.out.println("Password entered is invalid.");
	}
}
