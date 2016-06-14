package com.example;

/**
 * Created by klaus.machado on 14/06/2016.
 */
public class Soldier extends Enemy {
    private int armor;

    public Soldier(int hitPoints, int lives) {
        super(hitPoints, lives);
        this.armor = 1;
    }

    public void takeDamage(int damage) {
        int damageTaken = damage - armor;

        if (damageTaken <= 0) {
            System.out.println("No damage taken");
            return;
        }

        int remaningHitPoints = getHitPoints() - damageTaken;
        setHitPoints(remaningHitPoints);
        System.out.println("I took " + damageTaken + " points of damage, and have " + remaningHitPoints + " left.");
    }
}
