package Timus_task02;

import java.util.*;
public class task1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> visitedStores = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < N; i++) {
            String storeName = scanner.nextLine();
            // Если магазин уже был посещен, увеличиваем счетчик "БАЯН"
            if (visitedStores.contains(storeName)) {
                bayanCount++;
            } else {
                // Добавляем магазин в набор посещенных
                visitedStores.add(storeName);
            }
        }
        int uniqueStoresCount = visitedStores.size();
        int notVisitedStoresCount = N - uniqueStoresCount;

        System.out.println(notVisitedStoresCount);
    }
}