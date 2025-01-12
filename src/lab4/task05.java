package lab4;
import java.util.Random;
public class task05 {
    public static void main(String[] args) {
        Random random = new Random();
        int height = 3;
        int length = 5;
        int[][] arr = new int[height][length];
        int[][] new_arr = new int[length][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                new_arr[j][i] = arr[i][j];
            }
        }
        System.out.println("Старый массив");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Новый массив");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}