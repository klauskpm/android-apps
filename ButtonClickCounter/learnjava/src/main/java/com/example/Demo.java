package com.example;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Tim");
        System.out.println(tim.getHandleName());

        Player louise = new Player();
        louise.setLevel(3);
        System.out.println(louise.getLevel());
    }
}
