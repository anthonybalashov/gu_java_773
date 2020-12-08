package ru.ipbalashov.lesson6;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
        this.type = "Собака";
        this.maxRun = 500;
        this.maxSwim = 10;
    }

}
