package com.review.design_patterns.Prototype.model;

public class Warrior extends Enemy {

	public Warrior() {
		System.out.println("The Warrior was created");
	}
	
	@Override
	public void attack() {
		System.out.println("The Warrior attacks with his " + getWeapon());
	}

	@Override
	public void stopAttack() {
		System.out.println("The Warrior stops his attack");
	}

}
