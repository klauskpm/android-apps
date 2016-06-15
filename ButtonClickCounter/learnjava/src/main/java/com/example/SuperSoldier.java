package com.example;

/**
 * Created by klaus.machado on 15/06/2016.
 */
public class SuperSoldier extends Soldier {
    public SuperSoldier(int hitPoints, int lives) {
        super(hitPoints, lives);
    }

    public void takeDamage(int damage) {
        System.out.println("int");
        int damageTaken = Math.floorDiv(damage, 2);

        super.takeDamage(damageTaken);
    }

    public void takeDamage(float damage) {
        System.out.println("float");
        takeDamage((int) Math.floor((double) damage));
    }
}
