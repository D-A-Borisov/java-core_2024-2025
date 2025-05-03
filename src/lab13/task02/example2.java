package lab13.task02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class example2 {
    private  static final int[][] matrix = {{15, 64, 3, 15},
                                            {16, 121, 34, 12},
                                            {61, 53, 45, 90},
                                            {9, 76, 35, 87}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите индекс колонки матрицы для вывода: ");
        int index = input.nextInt();
        try {
            System.out.println(Arrays.toString(getColumn(index)));
        } catch (InputMismatchException e) {
            System.out.println("Не корректный ввод, индекс не соответствует int!");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого столбца в матрице нет! Столбцов: " + matrix[0].length);
        }
    }

    public static int[] getColumn(int index) {
        int[] result = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            result[i] = matrix[i][index];}
        return result;
    }
}