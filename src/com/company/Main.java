package com.company;

import java.util.Objects;

public class Main {

    private static Dog aDog;
    private static Dog newDog;
    private static Dog theDog;

    public static void main(String[] args) {

        aDog = new Dog("Max");
        theDog = new Dog("Max");
        newDog = aDog;
        String myName = "widura";

        if (aDog == theDog)
            System.out.println("Object references are equal");
        System.out.println(aDog);

        if(aDog.equals(theDog)){
            System.out.println("Two Object are similar");
        }
        else{
            System.out.println("Two object are not similar!");
        }
    }

    public static void foo() {

        aDog = new Dog("Widura");
        System.out.println(aDog.getName());
    }
}
