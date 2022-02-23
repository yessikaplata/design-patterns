package com.review.design_patterns.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.review.design_patterns.Factory.factory.FactoryCreditCard;
import com.review.design_patterns.Factory.model.ICreditCard;

/**
 * Factory pattern applied in credit card.
 *
 */
public class App {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* Read a amount request for credit card */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.format("\nEnter amount for credit card: \n");
		double amount = Double.parseDouble(reader.readLine());

		/* Create credit card according amount */
		FactoryCreditCard factory = new FactoryCreditCard();
		ICreditCard creditCard = factory.getCreditCard(amount);

		/* Print credit card data */
		System.out.format("\nYour card details are below : \n");
		System.out.format("Card Type: %s%nApproved Credit Amount: %,.0f%nAnnual Charge: %.2f%n", creditCard.getCardType(),
				creditCard.getCreditAmount(), creditCard.getAnnualCharge());
	}
}
