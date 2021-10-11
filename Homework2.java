/**
 * Java 1. Homework 2
 *
 * @author Leonskaya Ekaterina
 * @version 11.10.2021
 */

public class Homework2 {

    public static void main(String[] args) {
        //System.out.println(first(12,24));
        second(23);
        //System.out.println(third(12));
        fourth("hey", 4);
        //System.out.println(fifth(2020));

    }

    static boolean first (int a, int b){
        return ((10 <= a + b ) && (a + b <= 20));
    }

    static void second(int a){
        if(a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    static boolean third(int a){
        return (a<=0);
    }

    static void fourth(String a, int b){
        for (int i = 0; i < b; i++)
        System.out.println(a);
    }

    static boolean fifth(int a){
        return (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0));
    }
}
