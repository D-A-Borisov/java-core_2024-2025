package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name month: ");
        String month = in.nextLine();

        System.out.print("Input number of days in a month: ");
        int number_of_days = in.nextInt();

        System.out.println(month + " has " + number_of_days + " days. ");
    }
}