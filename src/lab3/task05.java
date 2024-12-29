package lab3;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int count = in.nextInt();
        System.out.println("Выберите тип цикла: ");
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        int choice = in.nextInt();
        int sum = 0;
        int number = 0;
        int foundNumbers = 0;
        switch (choice) {
            case 1: // Цикл for
                for (int i = 1; foundNumbers < count; i++) {
                    if (i % 5 == 2 || i % 3 == 1) {
                        System.out.println("Добавлено число: " + i);
                        sum += i;
                        foundNumbers++;
                    }
                }
                break;
            case 2: // Цикл while
                number = 1;
                while (foundNumbers < count) {
                    if (number % 5 == 2 || number % 3 == 1) {
                        System.out.println("Добавлено число: " + number);
                        sum += number;
                        foundNumbers++;
                    }
                    number++;
                }
                break;
            case 3: // Цикл do-while
                number = 1;
                do {
                    if (number % 5 == 2 || number % 3 == 1) {
                        System.out.println("Добавлено число: " + number);
                        sum += number;
                        foundNumbers++;
                    }
                    number++;
                } while (foundNumbers < count);
                break;
            default:
                System.out.println("Неверный выбор цикла.");
                return;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}