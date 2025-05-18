package Timus_task02;

import java.math.BigInteger;
import java.util.Scanner;
public class task1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        BigInteger bigInt = new BigInteger(N);
        BigInteger seven = new BigInteger("7");
        BigInteger remainder = bigInt.mod(seven);
        System.out.println(remainder);
    }
}