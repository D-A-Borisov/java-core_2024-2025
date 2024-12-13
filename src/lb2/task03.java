package project1;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = in.nextInt();
		
		if (number % 4 == 0 && number >= 10) {
			System.out.print("Число удовлетворяет требованиям");
		} else {
			System.out.print("Число не удовлетворяет требованиям");
		}
	}
}