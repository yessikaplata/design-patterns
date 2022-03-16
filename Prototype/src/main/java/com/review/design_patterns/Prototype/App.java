package com.review.design_patterns.Prototype;

import com.review.design_patterns.Prototype.model.BundleEnemyCache;
import com.review.design_patterns.Prototype.model.Enemy;

/**
 * Prototype pattern applied in video game.
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        BundleEnemyCache enemyCache = new BundleEnemyCache();
        
        //Gets prototype warrior enemy
        Enemy enemy = enemyCache.getEnemy("Warrior");
        System.out.println("The prototype is [" + enemy.getName() + "] and his weapon is  [" + enemy.getWeapon() + "]");
        
        //Create a clone 
        Enemy enemyClone = enemyCache.getEnemyClone(enemy.getName());
        System.out.println("The clone is [" + enemyClone.getName() + "] and his weapon is  [" + enemyClone.getWeapon() + "]");
        
        //Validate memory reference
        System.out.println(enemy == enemyClone ? "are the same instance in memory": "are diferentes instances");
        
        //Modify arm for the clone
        enemyClone.setWeapon("dagger");
        
        //Prints the new values for weapons
        System.out.println("After of modification weapons the values are:");
        System.out.println("The prototype is [" + enemy.getName() + "] and his weapon is  [" + enemy.getWeapon() + "]");
        System.out.println("The clone is [" + enemyClone.getName() + "] and his weapon is  [" + enemyClone.getWeapon() + "]");
        
    }
}
