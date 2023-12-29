package Serialization;

import java.io.Serializable;

public class MyObject implements Serializable{
    private String name;

    MyObject() {
        System.out.println("My Object Class");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name : " + name;
    }
}
