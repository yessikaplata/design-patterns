package com.review.design_patterns.Prototype.model;

public abstract class Enemy implements Cloneable{

	private String weapon;
	private String name;
	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Enemy getEnemyClone(String name) throws CloneNotSupportedException {
		return (Enemy) this.clone();
	}
	
    public abstract void attack();
    public abstract void stopAttack();
}
