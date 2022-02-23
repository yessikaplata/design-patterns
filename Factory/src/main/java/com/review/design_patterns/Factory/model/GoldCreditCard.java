package com.review.design_patterns.Factory.model;

public class GoldCreditCard implements ICreditCard {

	private final String type = "GoldCreditCard";
	private final Double limit = 10000000.0;
	private final Double charge = 17.9;
	private final Double discount = 0.5;
	private double amount = 0.0;

	public GoldCreditCard(double amount) {
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
