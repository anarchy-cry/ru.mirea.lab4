package ru.mirea.lab19.task2;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("Вы ввели пустую строку вместо ФИО");
    }
}
