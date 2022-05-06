package com.review.design_patterns.Facade.facade;

import com.review.design_patterns.Facade.subsystem.ATM;
import com.review.design_patterns.Facade.subsystem.Account;
import com.review.design_patterns.Facade.subsystem.Authentication;

public class ATMFacade {

	private Authentication authentication = new Authentication();
	private ATM atm = new ATM();
	private Account account = null;

	public void enterCredentials() {

		boolean isValidCard = authentication.readCard();
		if (isValidCard) {
			String password = authentication.enterPassword();
			boolean isValidPassword = authentication.validatePassword(password);

			if (isValidPassword) {
				account = authentication.getAccount();
				return;

			}
			authentication.doOnFailValidatePassword();
			return;
		}
		authentication.doOnFailReadCard();
	}

	public void withdrawMoney() {

		if (account != null) {
			double amount = atm.enterAmmount();
			boolean isAtmAmmount = atm.haveBalance(amount);

			if (isAtmAmmount) {
				boolean isSuccessTrx = account.withdrawMoney(amount);

				if (isSuccessTrx) {
					boolean isSuccess = atm.retrieveMoney();
					atm.printTicket(isSuccess);
				} else {
					atm.printTicket(false);

				}
			}
		}
	}
}
