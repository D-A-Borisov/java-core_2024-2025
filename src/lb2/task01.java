package project1;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = in.nextInt();
		if (number % 3 == 0) {
			System.out.print("Число делится на 3");
		}	else {
			System.out.print("Число не делится на 3");	
		}
	}

}