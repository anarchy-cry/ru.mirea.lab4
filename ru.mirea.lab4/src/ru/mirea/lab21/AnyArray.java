package ru.mirea.lab21;


public class AnyArray<T> {
    private T[] array;

    public AnyArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void print() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
