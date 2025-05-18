package Timus_task02;

import java.util.*;
public class task1617 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> wheelCount = new HashMap<>();

        // Читаем диаметры колес и подсчитываем их количество
        for (int i = 0; i < n; i++) {
            int diameter = scanner.nextInt();
            wheelCount.put(diameter, wheelCount.getOrDefault(diameter, 0) + 1);
        }
        int totalWagons = 0;
        // Подсчитываем, сколько вагонов можно оснастить
        for (int count : wheelCount.values()) {
            totalWagons += count / 4;
        }
        System.out.println(totalWagons);
    }
}