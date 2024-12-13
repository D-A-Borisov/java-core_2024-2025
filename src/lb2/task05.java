package project1;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = in.nextInt();
		int result = 0;
		int four_number = 0;
		result = number / 1000;
		four_number = number % 10;
		System.out.printf("Количество тысяч введённом числе: %d \n", result);
        System.out.printf("Четвёртая цифра с права: %d \n", four_number);
	}
}