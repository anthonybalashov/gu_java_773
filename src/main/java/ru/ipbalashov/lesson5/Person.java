package ru.ipbalashov.lesson5;

import java.util.Date;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("\n FIO: %s, position: %s, email: %s, phone: %s, salary: %d, age: %d", fio, position, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }
}
