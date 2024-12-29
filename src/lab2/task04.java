package lab2;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = in.nextInt();
		
		if (number >= 5 && number <= 10) {
			System.out.print("Число удовлетворяет условию");
		} else {
			System.out.print("Число не удовлетворяет условию");
		}
	}
}