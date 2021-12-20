/**
* Java 1. Homework #4
*
* @author Natalia Erokhova
* @version 18.12.2021
*/

import java.util.Scanner;
import java.util.Random;

class TicTacToe {
    
    final char SIGN_X = 'x'; //создание поля с неизменяемыми данными
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc; // объявление ссылочной переменной
    Random random; // объявление ссылочной переменной
    
    public static void main(String[] args) {
        /*Длинный вариант вызова нестатического метода game
        *
        * TicTacToe ttt = new TicTacToe(); создаем объект new TicTacToe(), 
        * который связан соссылочной переменной по имени ttt с типом этой 
        * переменной по имени класса
        * ttt.game(); через ссылочную переменную вызываем метод game, 
        * т.е. вызываем метод у объекта
        */
        //короткий вариант вызова метода game
        new TicTacToe().game();
        
    }
    
    // создаем метод с именем, полностью совпадающем с именем класса
    // такой метод называется конструктор и выполняется перед методом main
    TicTacToe() {
        //инициализируем переменные. Разделяем инициализацию и описание 
        // для всех типов переменных, кроме финализированных примитивных
        table = new char[3][3]; 
        sc = new Scanner(System.in);
        random = new Random();
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            // проверка для хода человека
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            // проверки для хода компьютера
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    } 
    
    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }
    
    boolean isCellValid(int x, int y) {
        if  (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    
    boolean isWin(char ch) {
        for (int y = 0; y < table.length; y++) {
            if (table[y][0] == ch && table[y][1] == ch && table[y][2] == ch) {
                return true;
            } 
        }
        for (int x = 0; x < table.length; x++) {
            if (table[0][x] == ch && table[1][x] == ch && table[2][x] == ch) {
                return true;
            }
        }
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }
    
    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}