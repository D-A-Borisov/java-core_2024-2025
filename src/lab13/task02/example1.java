package lab13.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввод размера массива
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Ошибка: размер массива должен быть положительным числом");
                return;
            }

            int[] array = new int[size];
            int positiveCount = 0;
            int sum = 0;

            // Ввод элементов массива
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                try {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();

                    if (array[i] > 0) {
                        sum += array[i];
                        positiveCount++;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введена строка вместо числа. Пожалуйста, введите целое число");
                    scanner.next(); // Очистка буфера сканера
                    i--; // Повторяем ввод для текущего элемента
                }
            }

            // Вычисление среднего значения положительных элементов
            if (positiveCount == 0) {
                System.out.println("Ошибка: положительные элементы отсутствуют");
            } else {
                double average = (double) sum / positiveCount;
                System.out.printf("Среднее значение положительных элементов: %.2f\n", average);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа для размера массива.");
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена");
        }
    }
}