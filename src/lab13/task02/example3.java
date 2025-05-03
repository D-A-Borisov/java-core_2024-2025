package lab13.task02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ввод размера массива
            System.out.print("Введите размер массива: ");
            int size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным числом");
                return;
            }

            // Ввод элементов массива
            byte[] array = new byte[size];
            System.out.println("Введите элементы массива (числа от -128 до 127):");

            for (int i = 0; i < size; i++) {
                try {
                    System.out.printf("Элемент %d: ", i + 1);
                    array[i] = sc.nextByte();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введите число от -128 до 127");
                    sc.nextLine(); // Очистка буфера
                    i--; // Повтор ввода
                }
            }

            // Вычисление суммы
            byte sum = 0;
            for (byte num : array) {
                // Проверка переполнения при суммировании
                if ((num > 0 && sum > Byte.MAX_VALUE - num) ||
                        (num < 0 && sum < Byte.MIN_VALUE - num)) {
                    throw new ArithmeticException("Переполнение при вычислении суммы");
                }
                sum += num;
            }

            System.out.println("Сумма элементов: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}