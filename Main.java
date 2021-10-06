package com.java24hours;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

     static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(){
        int a = -8;
        int b = 7;
        System.out.println(a+b>=0? "Сумма положительная":"Сумма отрицательная");
    }

    static void printColor(){
        int value = 300;
        if(value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <=100){
                System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int a = 10;
        int b = -5;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
