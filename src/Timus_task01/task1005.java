package Timus_task01;

import java.util.Scanner;
public class task1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Чтение количества камней
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) { // Чтение весов камней
            weights[i] = scanner.nextInt();
        }
        int totalWeight = 0; // Общий вес камней
        for (int weight : weights) {
            totalWeight += weight;
        }
        int minDifference = Integer.MAX_VALUE;
        // Перебор всех возможных подмножеств камней(куч)
        for (int mask = 0; mask < (1 << n); mask++) {
            int subsetWeight = 0;
            // Вычисление веса текущего подмножества
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetWeight += weights[i];
                }
            }
            // Вычисление разности весов двух куч
            int difference = Math.abs(totalWeight - 2 * subsetWeight);
            minDifference = Math.min(minDifference, difference);
        }
        System.out.println(minDifference);
    }
}