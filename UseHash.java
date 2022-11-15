package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class UseHash {

    public static void main(String args[]){
        int [] numbers = {3,8, 5, 9, 4};
        int target = 8;

        int[] values=twoSum(numbers, target);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }
    public static int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int x = numbers[i];
            map.put(target-x, i);
            if (map.containsKey(x)){
                return new int[]{
                        map.get(x) , i};
                }

            }
        throw new IllegalArgumentException("no two sum solution");
        }
}

