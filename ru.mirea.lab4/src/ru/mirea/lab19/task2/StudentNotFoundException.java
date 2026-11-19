package ru.mirea.lab19.task2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент «" + name + "» не найден");
    }
}
