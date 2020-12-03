package ru.ipbalashov.lesson4;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class XOGame {
    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static final int TO_WIN = 3;

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

      while (true) {
          humanTurn();
          printMap();
          if(checkWin(DOT_X)) {
              System.out.println("Вы выйграли!");
              break;
          }
          if (isFull()) {
              System.out.println("Ничья");
              break;
          }

          aiTurn();
          printMap();
          if(checkWin(DOT_O)) {
              System.out.println("Компьютер!");
              break;
          }
          if (isFull()) {
              System.out.println("Ничья");
              break;
          }
      }

    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    static void humanTurn(){
        int x;
        int y;

        do {
            System.out.println("input coord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y,x));
        map[y][x]= DOT_X;
    }

    static void aiTurn(){
        int x;
        int y;

        do {

            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y,x));
        map[y][x]= DOT_O;
    }


    static boolean isCellValid(int y, int x){
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }

        return map[y][x]==DOT_EMPTY;
    }

    static boolean isFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

 


    //    2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    //    3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
    //    Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

    // проверка на победу
     static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1,  sym)) return true;   // проверим линию по х
                if (checkLine(i, j, 1, 1,  sym)) return true;   // проверим по диагонали х у
                if (checkLine(i, j, 1, 0,  sym)) return true;   // проверим линию по у
                if (checkLine(i, j, -1, 1, sym)) return true;  // проверим по диагонали х -у
            }
        }
        return false;
    }
    // проверка линии
     static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE - 1 || wayY > SIZE - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (map[itemY][itemX] != sym) return false;
        }
        return true;
    }




}
