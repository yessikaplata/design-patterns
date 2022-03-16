package com.review.design_patterns.Prototype.model;

public class Magician extends Enemy {
	
	public Magician() {
		System.out.println("The Magician was created");
	}

	@Override
	public void attack() {
		System.out.println("The Magician attacks with his " + getWeapon());
	}

	@Override
	public void stopAttack() {
		System.out.println("The Magician stops his attack");
	}

}
