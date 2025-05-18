package Timus_task01;

import java.util.Scanner;
public class task1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        if (N >= 1) {
            // Если N больше или равен 1, используем формулу суммы
            sum = (N * (N + 1)) / 2;
        } else {
            // Если N меньше 1, суммируем от N до 1
            for (int i = N; i <= 1; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}