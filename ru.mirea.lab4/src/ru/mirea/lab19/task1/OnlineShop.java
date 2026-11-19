package ru.mirea.lab19.task1;

import java.util.Scanner;

public class OnlineShop {
    public static void checkInn(String inn) throws InvalidInnException {
        if (!inn.matches("\\d{12}")) {
            throw new InvalidInnException("ИНН должен состоять ровно из 12 цифр, а введено: " + inn);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ФИО: ");
        String fio = sc.nextLine();
        System.out.print("ИНН: ");
        String inn = sc.nextLine();

        try {
            checkInn(inn);
            System.out.println("Заказ оформлен на " + fio + ", ИНН " + inn);
        } catch (InvalidInnException e) {
            System.out.println("Заказ не оформлен. " + e.getMessage());
        }
    }
}
