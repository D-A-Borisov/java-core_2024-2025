package Timus_task02;

import java.util.Scanner;
public class task1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double maxArea = ((a + b) * (a + b) + 2 * (Math.sqrt(2) - 1) * a * b) / 4;
        System.out.printf("%.9f", maxArea);
    }
}