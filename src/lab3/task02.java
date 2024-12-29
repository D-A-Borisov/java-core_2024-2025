package lab3;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        int dayNumber = 0;
        if (day.equals("Понедельник")) {
            dayNumber = 1;
        } else if (day.equals("Вторник")) {
            dayNumber = 2;
        } else if (day.equals("Среда")) {
            dayNumber = 3;
        } else if (day.equals("Четверг")) {
            dayNumber = 4;
        } else if (day.equals("Пятница")) {
            dayNumber = 5;
        } else if (day.equals("Суббота")) {
            dayNumber = 6;
        } else if (day.equals("Воскресенье")) {
            dayNumber = 7;
        } else {
            System.out.println("Такого дня нет.");
            return;
        }
        System.out.println("Порядковый номер дня недели: " + dayNumber);
    }
}