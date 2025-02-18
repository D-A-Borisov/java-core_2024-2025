package lab6.Task10;
public class Main {
    public static void main(String[] args) {
        // Вызова метода с произвольным количеством аргументов
        int[] minMax = Class10.findMinMax(11, 15, 2, 55, -2, 13);
        System.out.println("Наименьшее значение: " + minMax[0]);
        System.out.println("Наибольшее значение: " + minMax[1]);
    }
}