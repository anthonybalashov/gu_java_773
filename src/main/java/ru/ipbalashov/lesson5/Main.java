package ru.ipbalashov.lesson5;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan Ivanovich", "IT-Engineer", "ivan@person.qa", "1234567890", 200000, 18);
        persArray[1] = new Person("Sidorov Sidor Sidorovich", "TeamLead", "sidorov@person.qa", "678454623", 120000, 25);
        persArray[2] = new Person("Petrov Petr Petrovich", "Analytic", "petrov@person.qa", "435485365", 80000, 42);
        persArray[3] = new Person("Geseva Gusina Gusinovna", "Manager", "geseva@person.qa", "123214565", 220000, 22);
        persArray[4] = new Person("Andreeva Andriana Andrianovna", "PR-Owner", "andreeva@person.qa", "3342343234", 50000, 55);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].getInfo();
            }
        }
    }


}
