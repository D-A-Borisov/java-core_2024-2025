package lab9.task02;

import java.util.Scanner;

public class BinaryNumber {
    public static String Binary(int n) {
       if (n == 0){
           return "";
       } else {
           return Binary(n / 2) + (n % 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичное представление: ");
        int N = in.nextInt();
        System.out.println(Binary(N));
    }
}