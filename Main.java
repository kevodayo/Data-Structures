package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> phone_Book = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n = in.nextInt();
        int i = 0;
        while ( i < n){
            System.out.println("Enter Name");
            String name = in.next();
            System.out.println("Enter Phone Number");
            int m = in.nextInt();
            phone_Book.put(name, m);
            i++;
        }
        System.out.println(phone_Book.size());

        System.out.println("Enter Name");
        String name = in.next();
        for(Map.Entry<String, Integer> entry: phone_Book.entrySet()) {
            if(entry.getKey().equals(name)){
                System.out.println("The value for key " + name + " is " + entry.getValue());
                break;
            }
        }

    }
}