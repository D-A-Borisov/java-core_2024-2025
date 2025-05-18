package Timus_task02;

import java.util.Scanner;
public class task1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int unusedBoomBooms = 0;
        int survivingDroids = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > k) {
                unusedBoomBooms += a[i] - k;
            } else {
                survivingDroids += k - a[i];
            }
        }
        System.out.println(unusedBoomBooms + " " + survivingDroids);
    }
}