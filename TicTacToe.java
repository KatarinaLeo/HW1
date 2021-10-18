/**
 * Java 1. Homework 4
 *
 * @author Leonskaya Ekaterina
 * @version 18.10.2021
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_0 = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;


    public static void main(String[] args){
        new TicTacToe().game();
    }

    TicTacToe(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game(){
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if(isWin(SIGN_X)){
                System.out.println("Ты победил");
                break;
            }
            if(isTableFull()){
                System.out.println("Ничья");
                break;
            }
            turnAi();
            if(isWin(SIGN_0)){
                System.out.println("Комп победил");
                break;
            }
            if(isTableFull()){
                System.out.println("Ничья");
                break;
            }
        }
        printTable();
    }

    void initTable(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman(){
        int x, y;
        do {
            System.out.println("Введите координаты от 1 до 3");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAi(){
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table [x][y] = SIGN_0;
    }

    boolean isCellValid(int x, int y){
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isWin(char ch){
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch))
                return true;
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch))
                return true;
        }
        return false;
    }

    boolean isTableFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}
