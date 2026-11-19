package ru.mirea.lab20;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
