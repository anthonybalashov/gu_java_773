package ru.ipbalashov.lesson6;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Кот не умеет плавать");
    }
}
