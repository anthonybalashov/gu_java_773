package ru.ipbalashov.lesson1;

public class MainApp {

    // HW 1.1 Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {

        // Вызов HW 1.3 для возвращения результата
        float resExpressionVal = expressionEval(2, 3.14f, 12, 2);
        System.out.println(resExpressionVal);

        // Вызов HW 1.4 для возвращшения результата
        System.out.println(checkSumRange(10, 6));

        // Вызов HW 1.5 для вывода в консоль
        checkPositiveOrNegative(5);

        // Вызов HW 1.6 для возврата (передачи) результата
        System.out.println(checkBoolPositiveOrNegative(-5));

        // Вызов HW 1.7 для вывода в консоль
        greeting("Антон");

        // HW 1.8 для вывода в консоль
        isLeapYear(2020);
    }

    // HW 1.2 Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void dataTypes() {
        byte a = 125;
        short b = 32000;
        int c = 2047183640;
        long d = 9223372016824745808L;
        float e = 3.14f;
        double f = 2.1345656767676565656;
        char g = 'A';
        boolean h = true;
        String j = "Hello Java";
    }

    // HW 1.3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float expressionEval(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // HW 1.4 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean checkSumRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // HW 1.5 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void checkPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.printf("Переданное число: %d  - положительное\n", a);
        } else {
            System.out.printf("Переданное число: %d - отрицательное\n", a);
        }
    }

    // HW 1.6 Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если
    // положительное.
    public static boolean checkBoolPositiveOrNegative(int a) {
        return a >= 0;
    }

    // HW 1.7 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name) {
        System.out.printf("Привет %s!\n", name);
    }

    // HW 1.8 *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.printf("Год %d високосный\n", year);
        } else {
            System.out.printf("Год %d обычный (не високосный)\n", year);
        }
    }
}

