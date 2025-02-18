package Timus;

import java.util.Scanner;
public class task1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.print(2); // W, R
        } else if (n == 2) {
            System.out.print(2); // WR, RW
        } else {
            long sum = 2; // Количество способов для n = 2
            long varOne = 2; // Количество способов для n = 1
            long varTwo = 0; // Для хранения предыдущего значения
            for (int i = 3; i <= n; i++) {
                varTwo = varOne; // Сохраняем предыдущее значение
                varOne = sum; // Обновляем varOne
                sum = varOne + varTwo; // Суммируем способы для n-1 и n-2
            }
            System.out.print(sum);
        }
    }
}