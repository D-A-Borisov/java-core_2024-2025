package lab5.task05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        Class05 object = new Class05();
        object.setNumber();
        object.setNumber(number);
        object.checkNumber();
    }
}