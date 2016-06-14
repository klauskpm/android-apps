package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(10, 3);
        System.out.println("Hitpoints: " + enemy.getHitPoints() + " lives: " + enemy.getLives());
        enemy.takeDamage(3);

        Soldier soldier = new Soldier(25, 3);
        System.out.println("Hitpoints: " + soldier.getHitPoints() + " lives: " + soldier.getLives());
        soldier.takeDamage(10);
    }
}
