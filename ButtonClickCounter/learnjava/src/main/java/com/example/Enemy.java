package com.example;

/**
 * Created by klaus.machado on 14/06/2016.
 */
public class Enemy {

    private int hitPoints;
    private int lives;

    public Enemy(int hitPoints, int lives) {
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remaningHitPoints = getHitPoints() - damage;
        setHitPoints(remaningHitPoints);
        System.out.println("I took " + damage + " points of damage, and have " + remaningHitPoints + " left.");
    }
}
