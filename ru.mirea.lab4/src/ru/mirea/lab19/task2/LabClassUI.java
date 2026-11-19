package ru.mirea.lab19.task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass lab;
    private Scanner sc;

    public LabClassUI(LabClass lab) {
        this.lab = lab;
        this.sc = new Scanner(System.in);
    }

    public void run() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("1 - показать студентов");
            System.out.println("2 - отсортировать по баллу (по убыванию)");
            System.out.println("3 - найти студента по ФИО");
            System.out.println("0 - выход");
            System.out.print("Ваш выбор: ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                lab.print();
            } else if (choice == 2) {
                lab.sort();
                lab.print();
            } else if (choice == 3) {
                System.out.print("ФИО: ");
                String name = sc.nextLine();
                try {
                    Student s = lab.find(name);
                    System.out.println("Найден: " + s);
                } catch (StudentNotFoundException e) {
                    System.out.println(e.getMessage());
                } catch (EmptyStringException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
