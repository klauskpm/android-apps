package com.example;

/**
 * Created by klaus.machado on 09/06/2016.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player() {
        setHandleName("Unknown player");
        setLives(5);
        setLevel(1);
        setScore(0);
        setDefaultWeapon();
    }

    public Player(String handle) {
        this();
        setHandleName(handle);
    }

    public Player(String handleName, int level) {
        this(handleName);
        setLevel(level);
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        if (handleName.length() < 3)
            return;

        this.handleName = handleName;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
