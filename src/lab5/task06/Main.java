package lab5.task06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number_1 = in.nextInt();
        System.out.print("Введите число 2: ");
        int number_2 = in.nextInt();
        Class06 object = new Class06();
        System.out.print("\nРезультат с 1 аргументом");
        object.setMaxAndMin(number_1);
        object.showMaxMin();
        System.out.print("\nРезультат с 2 аргументами");
        object.setMaxAndMin(number_1, number_2);
        object.showMaxMin();
    }
}