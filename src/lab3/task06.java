package lab3;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        // Запрос размера массива у пользователя с обработкой ошибок
        while (true) {
            System.out.print("Введите размер массива (положительное целое число): ");
            try {
                size = Integer.parseInt(in.nextLine());
                if (size <= 0) {
                    throw new NumberFormatException();
                }
                break; // Выход из цикла, если ввод корректен
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное положительное целое число.");
            }
        }
        // Создание массива
        int[] array = new int[size];
        int number = 2; // Начальное число, которое дает остаток 2 при делении на 5
        // Заполнение массива
        for (int i = 0; i < size; i++) {
            array[i] = number;
            number += 5; // Переход к следующему числу, которое дает остаток 2
        }
        // Вывод массива
        System.out.println("Содержимое массива:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}