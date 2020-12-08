package ru.ipbalashov.lesson6;

public class Main {



    public static void main(String[] args) {

        int catCounter = 0;
        int dogCounter = 0;
        int animalCounter = 0;

        Animals[] animal = new Animals[5];

        animal[0] = new Cat("Barsik");
        animal[1] = new Cat("Murzik");

        animal[2] = new Dog("Tuzik");
        animal[3] = new Dog("Bobik");

        animal[4] = new Animals("Taz");


        for (int i = 0; i < animal.length; i++) {
            animal[i].info();
            animal[i].run(200);
            animal[i].swim(200);

            if (animal[i].type == "Кот") {
            catCounter++;
            }
            if (animal[i].type =="Собака") {
                dogCounter++;
            }
            if (animal[i].type == null) {
                    animalCounter++;
                }
        }

        System.out.println("Котов: " + catCounter + "\nСобак: " + dogCounter + "\nЖивотных: " + animalCounter);

    }
}
