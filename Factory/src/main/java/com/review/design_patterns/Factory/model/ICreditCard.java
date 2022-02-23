package com.review.design_patterns.Factory.model;

public interface ICreditCard {

	public String getCardType();

	public double getAnnualCharge();

	public double getCreditLimit();
	
	public double getPercentageDiscount();
	
	public double getCreditAmount();

}
