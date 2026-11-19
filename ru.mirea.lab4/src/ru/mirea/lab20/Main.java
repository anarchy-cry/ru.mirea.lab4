package ru.mirea.lab20;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1-2: Triple<T, V, K>");
        Triple<String, Integer, Double> t = new Triple<>("Максим", 19, 4.5);
        System.out.println(t.getFirst() + ", " + t.getSecond() + ", " + t.getThird());
        t.printClassNames();

        System.out.println("\nЗадание 3: ограничения на типы");
        BoundedTriple<String, Dog, Integer> b = new BoundedTriple<>("Привет", new Dog("Бобик"), 3);
        System.out.println(b.getFirst() + ", " + b.getSecond() + ", " + b.getThird());
        b.printClassNames();

        System.out.println("\nЗадание 4: MinMax");
        Integer[] numbers = {7, -2, 15, 4, 0};
        MinMax<Integer> mm = new MinMax<>(numbers);
        System.out.println("min = " + mm.min() + ", max = " + mm.max());
        String[] words = {"груша", "яблоко", "апельсин"};
        MinMax<String> mw = new MinMax<>(words);
        System.out.println("min = " + mw.min() + ", max = " + mw.max());

        System.out.println("\nЗадание 4: Calculator");
        System.out.println("5 + 2.5 = " + Calculator.sum(5, 2.5));
        System.out.println("5 * 2.5 = " + Calculator.multiply(5, 2.5));
        System.out.println("10 / 4L = " + Calculator.divide(10, 4L));
        System.out.println("7.5f - 2 = " + Calculator.subtraction(7.5f, 2));
    }
}
