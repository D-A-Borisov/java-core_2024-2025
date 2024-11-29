package lr1;

import java.util.Scanner;

public class Example14{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int a = scn.nextInt();

        System.out.println("Less = " + (a-1));
        System.out.println("Number = " + (a));
        System.out.println("Over = " + (a+1));

        int sum = (a-1) + a + (a+1);
        int The_square_of_the_sum = sum * sum;

        System.out.println("The square of the sum = " + The_square_of_the_sum);
    }
}