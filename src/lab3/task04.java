package lab3;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = in.nextInt();
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        System.out.println("Выберите тип цикла для вывода чисел:");
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        System.out.print("Введите номер цикла (1, 2 или 3): ");
        int choice = in.nextInt();
        System.out.println("Целые числа от " + min + " до " + max + ":");
        switch (choice) {
            case 1: // Цикл for
                for (int i = min; i <= max; i++) {
                    System.out.print(i + " ");
                }
                break;
            case 2: // Цикл while
                int i = min;
                while (i <= max) {
                    System.out.print(i + " ");
                    i++;
                }
                break;
            case 3: // Цикл do-while
                i = min;
                do {
                    System.out.print(i + " ");
                    i++;
                } while (i <= max);
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите 1, 2 или 3.");
        }
    }
}