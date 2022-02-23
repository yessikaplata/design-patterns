package com.review.design_patterns.Factory.model;

public class BlackCreditCard implements ICreditCard {

	private final String type = "BlackCreditCard";
	private final double limit = 5000000.0;
	private final double charge = 17.6;
	private final double discount = 0.3;
	private double amount = 0.0;

	public BlackCreditCard(double amount) {
		if (amount > limit) {
			amount = limit;
		}
		this.amount = amount;
	}

	@Override
	public String getCardType() {
		return type;
	}

	@Override
	public double getAnnualCharge() {
		return charge;
	}

	@Override
	public double getCreditLimit() {
		return limit;
	}

	@Override
	public double getPercentageDiscount() {
		return discount;
	}

	@Override
	public double getCreditAmount() {
		return amount;
	}

}
