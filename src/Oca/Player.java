package Oca;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private int box;
    private int turnsLeft;
    private boolean isAlive;

    public String getName() {
        return name;
    }
    public int getBox() {
        return box;
    }
    public void setBox(int box) {
        this.box = box;
    }
    public int getTurnsLeft() {
        return turnsLeft;
    }
    public void setTurnsLeft(int turnsLeft) {
        this.turnsLeft = turnsLeft;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Player(String name, int box) {
        this.name = name;
        this.box = box;
        turnsLeft = 0;
        isAlive = true;
    }
}
