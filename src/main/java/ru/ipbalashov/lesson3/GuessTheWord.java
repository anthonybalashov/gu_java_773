package ru.ipbalashov.lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        int indexWord = random.nextInt(words.length - 1);
        int repeater = 1;
        String computerWord = words[indexWord];
        char[] chComputer = StrToChar(computerWord);
        String userWord;

        System.out.println("\nКомпьютер загадал слово из списка ниже. Угадайте!\n");
        System.out.println(Arrays.toString(words));
      //  System.out.println(computerWord);  // DEBUG - слово которое загадал компьютер

        do {
            System.out.print("\n Введите ваш ответ: ");
            userWord = scanner.nextLine();
            char[] chUser = StrToChar(userWord);

            StringBuilder sb = new StringBuilder();
            boolean repeatedChar;
            for (int i = 0; i < chUser.length; i++) {
                repeatedChar = false;
                for (int j = i + 1; j < chUser.length; j++) {
                    if (chUser[i]== chUser[j]) {
                        repeatedChar = true;
                        break;
                    }
                }
                if (!repeatedChar) {
                    sb.append(chUser[i]);
                }
            }

            chUser = StrToChar(sb.toString());

            int masked;
            if (userWord.equals(computerWord)) {
                repeater = 0;
                System.out.println("\n ВЫ УГАДАЛИ\nЗагаданное слово: " + computerWord);
            } else {
                for (int i = 0; i < computerWord.length(); i++) {
                    masked = 0;
                    for (int j = 0; j < sb.length(); j++) {
                        if (chComputer[i] == chUser[j]) {
                            System.out.print(chComputer[i]);
                        } else {
                            masked++;
                            if (masked == sb.length()) {
                                System.out.print("#");
                            }
                        }
                    }
                }

                int maskedfull = 15 - computerWord.length();
                for (int i = 0; i < maskedfull; i++) {
                    System.out.print("#");
                }
            }
        } while (repeater == 1);

    }

    static char[] StrToChar(String word) {
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
        return ch;
    }


}
