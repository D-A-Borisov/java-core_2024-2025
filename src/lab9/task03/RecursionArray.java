package lab9.task03;

import java.util.Scanner;

public class RecursionArray {
    public static void InputArray(int[] array, int i) {
        if(i < array.length){
            System.out.print(array[i] + " ");
            InputArray(array, i + 1);
        }
    }
    public static void OutputArray(int[] array, int i, Scanner in) {
        if(i < array.length){
            array[i] = in.nextInt();
            OutputArray(array, i + 1, in);
        }
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Введите размер массива: ");
      int size = in.nextInt();
      int[] arr = new int[size];
      System.out.println("Введите элементы массива: ");
      OutputArray(arr, 0, in);
      System.out.println("Вывод массива: ");
      InputArray(arr, 0);
    }
}