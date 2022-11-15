package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String args[]){

        HashMap <String, Integer> phone_number = new HashMap();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter entry number");
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Enter name");
            String name = in.next();
            System.out.println("Enter Phone_number");
            int number = in.nextInt();

            phone_number.put(name, number);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int out=phone_number.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }

    }
}
