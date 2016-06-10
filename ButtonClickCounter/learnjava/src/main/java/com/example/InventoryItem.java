package com.example;

enum ItemType {POTION, RING, ARMOR};
/**
 * Created by klaus.machado on 10/06/2016.
 */
public class InventoryItem {
    private ItemType type;
    private String name;

    public InventoryItem(ItemType type, String name) {
        super();
        setType(type);
        setName(name);
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
