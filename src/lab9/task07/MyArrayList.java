package lab9.task07;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        int N = 100000; // Количество человек в круге
        ArrayList<Integer> circle = new ArrayList<>();
        // Заполняем круг людьми
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }
        long startTime = System.nanoTime(); // Начало отсчета времени
        int index = 0;
        while (circle.size() > 1) {
            // Вычисляем индекс следующего человека, который будет вычеркнут
            index = (index + 1) % circle.size();
            // Удаляем человека из круга
            circle.remove(index);
        }
        long endTime = System.nanoTime(); // Конец отсчета времени
        long duration = (endTime - startTime) / 1_000_000; // Время в миллисекундах
        // Выводим оставшегося человека и время выполнения
        System.out.println("Оставшийся человек: " + circle.get(0));
        System.out.println("Время выполнения: " + duration + " мс");
    }
}