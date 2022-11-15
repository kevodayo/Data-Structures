package org.example;

import java.util.HashMap;

public class ArraySum {

    public static void main(String args[]){

        int arr[] = {1,7, 5, 6,10};
        int x = 20;
        getSum(arr, x);

    }
    public static boolean getSum(int arr1[], int x) {
        HashMap<Integer, Integer> sum = new HashMap<>();

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int summation = arr1[i] + arr1[j];

                if (summation == x) {
                    return true;
                }
            }

        }
        return false;
    }
}
