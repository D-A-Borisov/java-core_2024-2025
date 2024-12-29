package lab3;

import java.util.Random;
import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        // Заполняем массив случайными числами от 0 до 200
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200);
        }
        // Отображаем массив в консоль
        System.out.print("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Находим минимальное значение и его индексы
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        // Собираем индексы элементов с минимальным значением
        System.out.print("Минимальное значение: " + minValue + ", индексы: ");
        boolean first = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}