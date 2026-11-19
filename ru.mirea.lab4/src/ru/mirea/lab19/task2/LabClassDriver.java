package ru.mirea.lab19.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        Comparable[] students = {
                new Student("Иванов Иван Иванович", 4.2),
                new Student("Петров Пётр Петрович", 3.7),
                new Student("Смирнова Анна Олеговна", 4.9),
                new Student("Кузнецов Олег Андреевич", 4.5)
        };
        LabClass lab = new LabClass(students);
        LabClassUI ui = new LabClassUI(lab);
        ui.run();
    }
}
