package com.example;

/**
 * Created by klaus.machado on 09/06/2016.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        this.handleName = "Unknown player";
    }

    public Player(String handle) {
        setHandleName(handle);
        this.lives = 3;
        this.level = 1;
        this.score = 0;
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
}
