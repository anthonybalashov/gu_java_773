package ru.ipbalashov.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box("red", 5);
//        Box box2 = new Box("Red", 5);
//
//        System.out.println(box1);
//        System.out.println(box2);
//
//        System.out.println(box1.equals(box2));
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        int x = 7;
//        printValue(x);
//        Integer t = 1270;
////        printInt(t);
//        Integer y = 1270;
//        Character c = 'y';

//        System.out.println(y.equals(t));
//        System.out.println(y.compareTo(1270));
//        System.out.println(Integer.toBinaryString(5567));
//        System.out.println(Integer.parseInt("45") + 10);
//        System.out.println(Integer.max(4,7));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        String[] words = {"A", "B", "C"};
////        for (String word : words) {
//////            System.out.println(word);
////            word += "1";
////        }
//        for (int i = 0; i < words.length; i++) {
//            words[i] += "1";
//        }
//
//        System.out.println(Arrays.toString(words));

//        String s1 = "java";
//        String s2 = "java";
//        String s3 = new String("java");
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

//        StringBuilder sb = new StringBuilder("java");
////        sb.append(45).append('r').append("tyrtyrt").append(System.lineSeparator()).append("tryrt");
//        sb.replace(1,2, "7777");
//        sb.insert(2, "E");
////        sb.reverse();
//        System.out.println(sb);
//        sb.delete(3,6);
//        System.out.println(sb);


        Cat cat = new Cat("Murzik");
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Barsik-" + i);
        }
        Plate plate = new Plate(35);

        cat.eat(plate);
        cat.getSatiety();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].getSatiety();
        }

        plate.info();
        plate.addFood(100);
        plate.info();

        Dog dog = new Dog("Tuzik");
        dog.scare(cat);



    }

    public static void printValue(Integer a) {
        System.out.println("value= " + a);
    }

    public static void printInt(int i) {
        System.out.println("value= " + i);
    }
}
