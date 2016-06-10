package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 4);
        System.out.println(tim.getHandleName());
        System.out.println(tim.getWeapon().getDamageInflicted());

        Weapon myAxe = new Weapon("GoldShine Axe", 15, 50);

        Player louise = new Player();
        louise.setLevel(3);
        louise.setWeapon(myAxe);
        System.out.println(louise.getLevel());
        System.out.println(tim.getWeapon().getName());

        InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
        tim.addInventoryItem(redPotion);
        tim.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Armor"));
        tim.addInventoryItem(new InventoryItem(ItemType.RING, "+2 Ring of Protection"));
        tim.addInventoryItem(new InventoryItem(ItemType.POTION, "Invisibility Potion"));

        InventoryItem bluePotion = new InventoryItem(ItemType.POTION, "Blue Potion");

        boolean wasDeleted = tim.dropInventoryItem(redPotion);
        System.out.println(wasDeleted);

        ArrayList<InventoryItem> allItems = tim.getInventoryItems();

        for (InventoryItem item : allItems) {
            System.out.println(item.getName());
        }
    }
}
