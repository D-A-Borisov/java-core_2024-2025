package lab6.Task06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        int[] array = {11, 37, 33, 67, 91, 23, 64, 89};
        int [] result = Class06.newArrayArgument(array, number);
        for (int arr : result) {
            System.out.println(arr);
        }
    }
}