package lab6.Task03;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};
        System.out.println("Наибольшее значение: " + Class03.findMax(numbers));
        System.out.println("Наименьшее значение: " + Class03.findMin(numbers));
        System.out.println("Среднее значение: " + Class03.findAverage(numbers));
    }
}