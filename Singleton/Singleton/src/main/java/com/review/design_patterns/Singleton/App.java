package com.review.design_patterns.Singleton;

/**
 * Design Patterns: Singleton
 *
 */
public class App {
	public static void main(String[] args) {
		/* Without use of Singleton */
		Clock clock1 = new Clock();
		System.out.println(clock1.getTime());

		Clock clock2 = new Clock();
		System.out.println(clock2.getTime());

		System.out.println("Is unique instance? ::" + clock1.equals(clock2));

		/* Implements Singleton */
		ClockSingleton clockSingleton1 = ClockSingleton.getInstance();
		System.out.println(clockSingleton1.getTime());

		ClockSingleton clockSingleton2 = ClockSingleton.getInstance();
		System.out.println(clockSingleton2.getTime());

		System.out.println("Is unique instance? ::" + clockSingleton1.equals(clockSingleton2));
	}
}
