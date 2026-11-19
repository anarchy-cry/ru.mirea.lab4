package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryList {
    public static List<String> readDirectory(String path) {
        List<String> list = new ArrayList<>();
        File dir = new File(path);
        String[] names = dir.list();
        if (names != null) {
            for (String name : names) {
                list.add(name);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> files = readDirectory(".");
        System.out.println("Всего в каталоге: " + files.size());
        System.out.println("Первые 5 элементов:");
        for (int i = 0; i < 5 && i < files.size(); i++) {
            System.out.println(files.get(i));
        }
    }
}
