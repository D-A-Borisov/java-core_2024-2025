package lab3;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи: ");
        int number = in.nextInt();
        System.out.println("Выберите тип цикла для генерации последовательности: ");
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        int choice = in.nextInt();
        int a = 1, b = 1;
        switch (choice) {
            case 1:
                System.out.print("Последовательность Фибоначчи (Цикл for): ");
                for (int i = 1; i <= number; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
                break;
            case 2:
                System.out.print("Последовательность Фибоначчи (Цикл while): ");
                int i = 1;
                while (i <= number) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                    i++;
                }
                break;
            case 3:
                System.out.print("Последовательность Фибоначчи (Цикл do-while): ");
                i = 1;
                do {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                    i++;
                } while (i <= number);
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите 1, 2 или 3.");
                return;
        }
    }
}