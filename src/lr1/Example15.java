package lr1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number А: = ");
        int a = scn.nextInt();

        System.out.println("Enter a number B: = ");
        int b = scn.nextInt();

        System.out.println("Sum = " + (a+b));
        System.out.println("Difference = "+  (a-b));
    }
}