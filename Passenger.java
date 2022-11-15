package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Passenger {

    public static void main(String args[]){

        Car car = new Car("Toyota", "3","kevine");
        Car car1 = new Car("Matatu", "4","Boy");
        Car car2 = new Car("Nissan", "3","kevine");

        List<Car> allCars = new ArrayList<>(Arrays.asList(car,car1,car2));

        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

        for (Car zack: allCars){
            if (hm.containsKey(zack.name)){
                hm.get(zack.name).add(zack.PassId +"--->"+ zack.passName);
            }else {
                hm.put(zack.name, new ArrayList<>());
                hm.get(zack.name).add(zack.PassId +"--->"+ zack.passName);
            }
        }
        System.out.println(hm);
    }



}
