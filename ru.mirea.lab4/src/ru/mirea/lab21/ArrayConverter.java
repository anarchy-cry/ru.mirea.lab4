package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"один", "два", "три"};
        Integer[] numbers = {10, 20, 30};

        List<String> wordList = toList(words);
        List<Integer> numberList = toList(numbers);

        System.out.println("Список строк: " + wordList);
        System.out.println("Список чисел: " + numberList);
    }
}
