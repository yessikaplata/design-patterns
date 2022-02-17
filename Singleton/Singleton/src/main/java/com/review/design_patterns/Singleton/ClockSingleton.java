package com.review.design_patterns.Singleton;

import java.util.Date;

public class ClockSingleton {

	/*Define an attribute for access to the instance*/
	private static ClockSingleton clockSingleton;
	
	/*Define a private constructor to ensure a unique instance */
	private ClockSingleton() {
		
	}
	
	/*Define an access method for the instance*/
	public static ClockSingleton getInstance() {
		if(clockSingleton == null) {
			clockSingleton = new ClockSingleton();
		}
		return clockSingleton;
	}

	public String getTime() {
		return new Date(System.currentTimeMillis()).toString();
	}
}
