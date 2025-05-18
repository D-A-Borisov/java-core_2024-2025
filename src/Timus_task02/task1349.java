package Timus_task02;

import java.util.Scanner;
public class task1349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (a != b && a != c && b != c) {  // Условие, что числа должны быть различны
                        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                            System.out.println(a + " " + b + " " + c);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);  // Если решения нет
    }
}