package lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = in.nextLine();

        System.out.print("Enter the year of birth: ");
        int birthYear = in.nextInt();

        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.printf("Name: %s  Age: %d ", name, age);
    }
}
