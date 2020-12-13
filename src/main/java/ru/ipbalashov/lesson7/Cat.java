package ru.ipbalashov.lesson7;

public class Cat {
    private String name;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void getSatiety() {
        System.out.println("Cat "+ name + " satiety "+ satiety);
    }

    public void eat(Plate plate) {
        System.out.println("cat " + name + " eat...");
        if (plate.decreaseFood(10)) {satiety= true;};

    }

    public void setSatiety(){
        this.satiety = true;
    }

    public void fear(Dog dog){
        System.out.println("Cat "+ name + " fear dog "+ dog.getName());
    }


}
