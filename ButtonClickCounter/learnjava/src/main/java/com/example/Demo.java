package com.example;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 4);
        System.out.println(tim.getHandleName());
        System.out.println(tim.getWeapon().getDamageInflicted());

        Player louise = new Player();
        louise.setLevel(3);
        System.out.println(louise.getLevel());
        System.out.println(tim.getWeapon().getName());
    }
}
