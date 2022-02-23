package com.review.design_patterns.Factory.factory;

import com.review.design_patterns.Factory.model.BlackCreditCard;
import com.review.design_patterns.Factory.model.GoldCreditCard;
import com.review.design_patterns.Factory.model.ICreditCard;
import com.review.design_patterns.Factory.model.RedCreditCard;

/*
 * Factory for credit card. Return a credit card according to amount
 */
public class FactoryCreditCard {

	public ICreditCard getCreditCard(double amount) {

		if (amount >= 10000000.0) {
			return new GoldCreditCard(amount);
		} else if (amount >= 5000000.0) {
			return new BlackCreditCard(amount);
		} else {
			return new RedCreditCard(amount);
		}

	}

}
