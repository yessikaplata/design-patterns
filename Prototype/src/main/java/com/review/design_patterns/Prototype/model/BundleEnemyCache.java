package com.review.design_patterns.Prototype.model;

import java.util.HashMap;
import java.util.Map;

public class BundleEnemyCache {

	private Map<String, Enemy> enemies = new HashMap<>();

	public BundleEnemyCache() {
		Magician magician = new Magician();
		magician.setName("Magician");
		magician.setWeapon("Magic wand");
		this.addEnemy(magician);

		Warrior warrior = new Warrior();
		warrior.setName("Warrior");
		warrior.setWeapon("blade");
		this.addEnemy(warrior);
	}

	public void addEnemy(Enemy enemy) {
		enemies.put(enemy.getName(), enemy);
	}

	public Enemy getEnemy(String name) {
		return enemies.get(name);
	}

	public Enemy getEnemyClone(String name) throws CloneNotSupportedException {
		return enemies.get(name).getEnemyClone(name);
	}
}
