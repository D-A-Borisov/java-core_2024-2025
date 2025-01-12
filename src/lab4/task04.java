package lab4;
public class task04 {
    public static void main(String[] args) {
        int height = 5;
        int[][] arr = new int[height][];
        for (int i = 0; i < height; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}