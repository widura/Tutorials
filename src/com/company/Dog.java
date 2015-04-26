package com.company;

/**
 * Created by widura on 4/25/15.
 */
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Dog && ((Dog) o).getName().equals(this.name)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
