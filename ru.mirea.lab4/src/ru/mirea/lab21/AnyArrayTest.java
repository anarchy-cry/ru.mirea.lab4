package ru.mirea.lab21;

public class AnyArrayTest {
    public static void main(String[] args) {
        AnyArray<Integer> ints = new AnyArray<>(new Integer[]{1, 2, 3});
        AnyArray<Long> longs = new AnyArray<>(new Long[]{10000000000L, 20000000000L});
        AnyArray<Double> doubles = new AnyArray<>(new Double[]{1.5, 2.75});
        AnyArray<String> strings = new AnyArray<>(new String[]{"a", "b", "c"});

        System.out.println("Задание 2: массивы разных типов");
        ints.print();
        longs.print();
        doubles.print();
        strings.print();

        System.out.println("Задание 3: элемент по индексу");
        int x = ints.get(1);
        System.out.println("ints.get(1) = " + x);
        System.out.println("longs.get(0) = " + longs.get(0));
        System.out.println("strings.get(2) = " + strings.get(2));
    }
}
