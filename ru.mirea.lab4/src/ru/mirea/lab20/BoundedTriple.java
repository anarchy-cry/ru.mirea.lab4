package ru.mirea.lab20;


import java.io.Serializable;

public class BoundedTriple<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T first;
    private V second;
    private K third;

    public BoundedTriple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("T: " + first.getClass().getName());
        System.out.println("V: " + second.getClass().getName());
        System.out.println("K: " + third.getClass().getName());
    }
}
