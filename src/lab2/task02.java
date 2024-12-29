package lab2;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = in.nextInt();
		
		if (number % 5 == 2 && number % 7 == 1) {
			System.out.print("Число удовлетворяет требованиям");
		} else {
			System.out.print("Число не удовлетворяет требованиям");
		}
	}
}