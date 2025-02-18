package lab5.task04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с плавающей запятой (например, 65,1267): ");
        double doubleValue = scanner.nextDouble();
        Class04 obj = new Class04(doubleValue);
        System.out.println("\nРезультаты:");
        obj.display();
    }
}