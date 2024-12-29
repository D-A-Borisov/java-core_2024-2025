package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Name day: ");
        String Day = in.nextLine();

        System.out.println("Input Month: ");
        String Month = in.nextLine();

        System.out.println("Input Number day: ");
        int Number = in.nextInt();

        System.out.println("Today:"+Day+" "+Number+" "+Month);
        in.close();
    }
}