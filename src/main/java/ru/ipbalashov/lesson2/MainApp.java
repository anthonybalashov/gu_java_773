package ru.ipbalashov.lesson2;

import java.util.Arrays;
import java.util.Random;

public class MainApp {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("HW 2.1");
        replaceArray();

        System.out.println("\nHW 2.2");
        createArr();

        System.out.println("\nHW 2.3");
        multipleArrayItems();

        System.out.println("\nHW 2.4");
        multArrayX(10);

        System.out.println("\nHW 2.5 **");
        minMaxArrayItem(15);

        System.out.println("\nHW 2.6 **");
        int[] arrInit = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(compareSumArray(arrInit));

        System.out.println("\nHW 2.7 ****");
        int[] arrInitShift = {2, 1, 23, 4, 11, 77, 2, 1};
        shiftArrayLeft(arrInitShift, 2);

    }

    // HW 2.1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replaceArray() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
        }
        System.out.println(Arrays.toString(arr) + " - Первичный сгенерированный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr) + " - Измененный массив");
    }


    // HW 2.2 Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void createArr() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else {
                arr[i] = j;
            }
            j += 3;
        }
        System.out.println(Arrays.toString(arr) + " - Заполненный массив циклом");
    }

    // HW 2.3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void multipleArrayItems() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr) + " - Первичный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr) + " - Массив с перемноженными элементами");
    }

    // HW 2.4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void multArrayX(int matrix) {
        int[][] arr = new int[matrix][matrix];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    // HW 2.5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMaxArrayItem(int arrLength){
        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100)-50;
        }
        System.out.println(Arrays.toString(arr) + " - Сгенерированный массив");
        System.out.println(Arrays.stream(arr).max().getAsInt() + " - Максимальный элемент массива");
        System.out.println(Arrays.stream(arr).min().getAsInt() + " - Минимальный элемент массива");
    }

    // HW 2.6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean compareSumArray(int[] arr){
        if (arr == null) {
            System.out.println("Пустой массив");
            return false;
        }
        int left = 0, right =0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 2) {
                left+=arr[i];
            } else {
                right+=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + " - Переданный массив");
        System.out.println(left  + " - Левая часть массива");
        System.out.println(right  + " - Правая часть массива");
        return (left == right);
    }


    // HW 2.7 ****Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при
    // n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
   public static void shiftArrayLeft(int[] arr, int shift){
        int[] newArray = new int[shift];
       System.out.println(Arrays.toString(arr) + " - Первичный массив");
       for (int i = 0; i <arr.length; i++) {
           if (i < shift) {
               newArray[i] = arr[i];
               continue;
           }
           arr[i - shift] = arr[i];
       }
       System.arraycopy(newArray, 0, arr, arr.length - shift, shift);
       System.out.println(Arrays.toString(arr) + " - Массив после сдвига на " + shift + "влево");
   }




}
