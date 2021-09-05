package com.mycompany.app;

public class App {


    public static void fillRandomArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21));
        }
    }

    public static boolean decreasingArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1])
                return false;
        }
        return true;
    }


}