package org.example;

public class Car {

    public String name;
    public String PassId;
    public String passName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassId() {
        return PassId;
    }

    public void setPassId(String passId) {
        PassId = passId;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public Car(String name, String passId, String passName) {
        this.name = name;
        PassId = passId;
        this.passName = passName;
    }




}
