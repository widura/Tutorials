package com.company;

import java.util.Objects;

public class Main {

    private static Dog aDog;
    private static Dog newDog;
    private static Dog theDog;

        public static void main(String[] args) {

        aDog = new Dog("Max");
        theDog = new Dog("Obama");
        newDog = aDog;

        if(aDog==theDog)
            System.out.println("Object references are equal");
        System.out.println(aDog);


    }

    public static void foo(){

        aDog = new Dog("Widura");
        System.out.println(aDog.getName());
    }
}
