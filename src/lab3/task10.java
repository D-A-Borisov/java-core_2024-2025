package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Случайные числа от 0 до 99
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        // Сортируем массив в порядке убывания
        Arrays.sort(array); // Сортируем массив по возрастанию
        reverseArray(array); // Переворачиваем массив для убывания
        System.out.println("Отсортированный массив (убывание): " + Arrays.toString(array));
    }
    // Метод для обратного массива
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Меняем местами элементы
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}