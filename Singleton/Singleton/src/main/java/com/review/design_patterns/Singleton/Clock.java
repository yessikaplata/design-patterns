package com.review.design_patterns.Singleton;

import java.util.Date;

public class Clock {
	/* Public constructor for create instances of Clock */
	public Clock() {

	}

	public String getTime() {
		return new Date(System.currentTimeMillis()).toString();
	}
}
