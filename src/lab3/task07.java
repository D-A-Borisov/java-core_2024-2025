package lab3;

public class task07 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];
        // Заполнение массива буквами "через одну"
        for (int i = 0; i < size; i++) {
            array[i] = (char) ('а' + i * 2);
        }
        //Вывод массива
        System.out.println("Массив в прямом порядке:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println(); // Переход на новую строку
        // Вывод массива в обратном порядке
        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}