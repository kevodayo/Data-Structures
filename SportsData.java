package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SportsData {

    public static void main(String[] args) {

        Student s1 = new Student("Ram", "1", "Tennis");
        Student s2 = new Student("John", "3", "Caroms");
        Student s3 = new Student("John", "1", "Tennis");
        Student s4 = new Student("Neha", "3", "Caroms");
        Student s5 = new Student("Ram", "4", "Cricket");
        Student s6 = new Student("Ram", "2", "Chess");

        List<Student> l = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

        for(Student s : l) {
            if (hm.containsKey(s.name)) {
                hm.get(s.name).add(s.sportId+"-"+s.sport);
            } else {
                hm.put(s.name, new ArrayList<String>());
                hm.get(s.name).add(s.sportId+"-"+s.sport);
            }
        }
        System.out.println(hm);
    }
}
