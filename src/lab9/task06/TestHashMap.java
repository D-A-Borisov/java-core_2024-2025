package lab9.task06;

import java.util.HashMap;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Random random = new Random();
        Set<Integer> usedKeys = new HashSet<>(); // Для отслеживания использованных ключей
        // Заполняем HashMap
        while (map.size() < 10) {
            int key = random.nextInt(10); // Ключ от 0 до 9
            if (!usedKeys.contains(key)) { // Проверяем, что ключ еще не использовался
                int length = random.nextInt(10) + 1; // Случайная длина строки от 1 до 10
                String value = generateRandomString(length); // Генерируем строку заданной длины
                map.put(key, value);
                usedKeys.add(key); // Добавляем ключ в использованные
            }
        }
        System.out.println("Содержимое HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
        }
        System.out.println("\nКлючи, где длина строки > 5:");
        for (Integer key : map.keySet()) {
            if (map.get(key).length() > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
            }
        }
        if (map.containsKey(0)) {
            System.out.println("\nСтрока с ключом 0: " + map.get(0));
        }
        int result = 1;
        for (Integer key : map.keySet()) {
            if (map.get(key).length() > 5) {
                result *= key;
            }
        }
        System.out.println("\nПроизведение ключей, где длина строки > 5: " + result);
    }
    // Метод для генерации случайной строки заданной длины
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}