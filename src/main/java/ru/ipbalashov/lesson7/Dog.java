package ru.ipbalashov.lesson7;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void scare(Cat cat){
        System.out.println("Dog "+ name + " gav gav to cat "+cat.getName());
        cat.fear(this);
    }
}
