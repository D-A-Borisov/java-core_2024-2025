package lab6.Task08;
public class Main {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.print("Элементы массива: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        double average = Class08.calAverage(intArray);
        System.out.println("Среднее значение элементов массива: " + average);
    }
}