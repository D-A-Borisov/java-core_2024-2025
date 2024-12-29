package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        int currentYear = 2024;

        int years = currentYear - age;

        System.out.println("Your year: " + years);
    }
}