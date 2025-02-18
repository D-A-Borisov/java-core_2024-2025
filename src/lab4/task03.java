package lab4;
public class task03 {
    public static void main(String[] args) {
        int height = 5;
        int length = 10;
        int [][] arr = new int[height][length];
        //Заполняем массив
        for (int i = 0; i < height; i++){
            for (int j = 0; j < length; j++){
                arr [i][j] = 2;
            }
        }
        //выводим прямоугольник
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}