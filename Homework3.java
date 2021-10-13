import java.util.Arrays;

/**
 * Java 1. Homework 3
 *
 * @author Leonskaya Ekaterina
 * @version 13.10.2021
 */

public class Homework3 {

    public static void main(String[] args) {
        firstArray();
        secondArray();
        thirdArray();
        fourthArray();
        System.out.println(Arrays.toString(fifthArray(4,6)));
        sixthArray();
        System.out.println(seventhArray());
        int[] arr ={3,4,5,6};
        eightArray(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

    static void firstArray(){
        int arr [] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i]=1;
            } else {
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void secondArray(){
        int arr [] = new int[100];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void thirdArray(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if (arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fourthArray(){
        int [][] arr = new int [5][5];
        for (int i=0; i< arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] fifthArray(int len, int initialValue){
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    static void sixthArray(){
        int arr [] = {46, 15, -47, 98, 1, 5, -7};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[min] > arr [i]){
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        System.out.println("Min элемент массива: " + arr[min]);
        System.out.println("Max элемент массива: " + arr[max]);
    }

    static boolean seventhArray(){
        int arr [] = {2,43,12,-12, 8, 35};
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++){
            rightSum = rightSum + arr[i];
        }
        boolean answer = false;
        for (int i = 0; i < arr.length; i++){
            if(rightSum == leftSum){
                answer = true;
            }
            leftSum = leftSum + arr[i];
            rightSum = rightSum - arr[i];
        }
        return answer;
    }

    static void eightArray(int[] arr,int n){
        for (int j = 0; j < n; j++) {
            int tmp1 = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int tmp2 = arr[i];
                arr[i] = tmp1;
                tmp1 = tmp2;
            }
            arr[0] = tmp1;
        }
    }
}
