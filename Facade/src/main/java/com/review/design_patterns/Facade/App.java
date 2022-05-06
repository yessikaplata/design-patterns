package com.review.design_patterns.Facade;

import com.review.design_patterns.Facade.facade.ATMFacade;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ATMFacade atmFacade = new ATMFacade();
		atmFacade.enterCredentials();
		atmFacade.withdrawMoney();
	}
}
