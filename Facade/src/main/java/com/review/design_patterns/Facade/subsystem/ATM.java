package com.review.design_patterns.Facade.subsystem;

public class ATM {
	private double atmAmmount = 5000;
	private double amount;

    public double enterAmmount(){
		System.out.println("Amount was entered");
    	amount = 100; //simulates read amount entered for client
    	return amount;
    }

    public boolean haveBalance(double amount){
    	return atmAmmount > amount;
    }

    public boolean retrieveMoney(){
		System.out.println("Amount was delivered");
    	return true;
    }

    public void printTicket(boolean success){
    	if(success) {
    		System.out.println("Your transaction was success");
    		
    	}else {
    		System.out.println("Your transaction could not be processed");
    	}
    }
}
