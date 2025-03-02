package lab9.task09;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {
        int size = 300000; // Количество элементов для тестирования
        // Создаем коллекции
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("=== Время добавления ===");
        System.out.println("ArrayDeque (в начало): " + getAddTime(arrayDeque, size, true) + " мс");
        System.out.println("ArrayDeque (в конец): " + getAddTime(arrayDeque, size, false) + " мс");

        System.out.println("LinkedHashSet (в конец): " + getAddTime(linkedHashSet, size, false) + " мс");

        System.out.println("ArrayList (в начало): " + getAddTime(arrayList, size, true) + " мс");
        System.out.println("ArrayList (в середину): " + getAddMiddleTime(arrayList, size) + " мс");
        System.out.println("ArrayList (в конец): " + getAddTime(arrayList, size, false) + " мс");

        System.out.println("\n=== Время удаления ===");
        System.out.println("ArrayDeque (в начале): " + getRemoveTime(arrayDeque, size, true) + " мс");
        System.out.println("ArrayDeque (в конце): " + getRemoveTime(arrayDeque, size, false) + " мс");

        System.out.println("LinkedHashSet (в конце): " + getRemoveTime(linkedHashSet, size, false) + " мс");

        System.out.println("ArrayList (в начале): " + getRemoveTime(arrayList, size, true) + " мс");
        System.out.println("ArrayList (в середине): " + getRemoveMiddleTime(arrayList, size) + " мс");
        System.out.println("ArrayList (в конце): " + getRemoveTime(arrayList, size, false) + " мс");

        System.out.println("\n=== Время получения элемента по индексу ===");
        System.out.println("ArrayList (по индексу): " + getGetTime(arrayList, size) + " мс");
    }

    // Метод для измерения времени добавления элементов в начало или конец коллекции
    private static long getAddTime(Collection<Integer> collection, int n, boolean addToStart) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if (addToStart && collection instanceof ArrayDeque) {
                ((ArrayDeque<Integer>) collection).addFirst(i); // Добавление в начало для ArrayDeque
            } else {
                collection.add(i);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени добавления элементов в середину ArrayList
    private static long getAddMiddleTime(ArrayList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(list.size() / 2, i); // Добавление в середину
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени удаления элементов с начала или конца коллекции
    private static long getRemoveTime(Collection<Integer> collection, int size, boolean removeFromStart) {
        // Заполняем коллекцию
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            if (removeFromStart && collection instanceof ArrayDeque) {
                ((ArrayDeque<Integer>) collection).removeFirst(); // Удаление с начала для ArrayDeque
            } else if (collection instanceof ArrayList) {
                ((ArrayList<Integer>) collection).remove(0); // Удаление с начала для ArrayList
            } else {
                collection.remove(i); // Удаление с конца
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени удаления элементов с середины ArrayList
    private static long getRemoveMiddleTime(ArrayList<Integer> list, int size) {
        // Заполняем список
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.remove(list.size() / 2); // Удаление с середины
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени получения элемента по индексу
    private static long getGetTime(ArrayList<Integer> list, int size) {
        // Заполняем список
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.get(i); // Получение элемента по индексу
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}