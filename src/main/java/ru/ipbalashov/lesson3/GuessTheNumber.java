package ru.ipbalashov.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int repeat;
        do {
            theGame();
            repeat = repeatGame();

        } while (repeat != 0);


    }

    static int repeatGame() {
        int answer;
        do {
            System.out.print("\nПовторить игру еще раз? (1 - да/ 0 - нет) \nВаш выбор: ");
            answer = scanner.nextInt();
            if (answer == 0 || answer == 1) {
                System.out.println();
                break;
            } else {
                System.out.println("Некорректный ввод, введите снова.");
            }
        } while (answer != 0 || answer != 1);
        return answer;
    }

    static void theGame() {
        int userNumber;
        System.out.print("\n.:: ИГРА - Угадай число ::.\nКомпьютер загадал число от 0 до 9.\nПопробуйте угадать!");
        int theNumber = random.nextInt(10);
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nУ вас есть %d попытки.\nВведите Ваш ответ: ", (3 - i));
            userNumber = scanner.nextInt();
            if (userNumber == theNumber) {
                System.out.println("\nВЫ ВЫЙГРАЛИ");
                System.out.println("Вы угадали, задуманное число: " + theNumber);
                break;
            } else {
                System.out.printf(userNumber < theNumber ? "Число %d меньше задуманного, попробуйте снова..."
                        : "Число %d больше задуманного, попробуйте снова...", userNumber);
                if (i == 2) {
                    System.out.println("\nВЫ ПРОИГРАЛИ");
                }
            }
        }
    }

}
