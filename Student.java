package org.example;

public class Student {

     String name;
     String sport;
     String sportId;

    Student(String name, String sportId, String sport) {
        this.name = name;
        this.sportId = sportId;
        this.sport = sport;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getSport(){
        return sport;
    }
    public void setSport (String sport){
        this.sport = sport;
    }
    public String getSportId(){
        return sportId;
    }
    public void setsportId (String sportId){
        this.sportId = sportId;
    }

}
