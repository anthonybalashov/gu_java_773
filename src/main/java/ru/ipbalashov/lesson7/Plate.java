package ru.ipbalashov.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        this.food = this.food+food;
    }

    public boolean decreaseFood(int amount) {
        if (amount < 0) {
            return false;
        }
        if (amount > this.food) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void info() {
        System.out.println("Food: " + food);
    }
}
