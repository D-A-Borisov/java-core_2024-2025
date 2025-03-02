package lab9.task07;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        int N = 100000;
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }
        long startTime = System.nanoTime();
        int index = 0;
        while (circle.size() > 1) {
            // Вычисляем индекс следующего человека, который будет вычеркнут
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;

        System.out.println("Оставшийся человек: " + circle.get(0));
        System.out.println("Время выполнения: " + duration + " мс");
    }
}