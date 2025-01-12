package lab4;
import java.util.Random;
public class task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int height = 5;
        int length = 5;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = random.nextInt(100);}}
        System.out.println("Исходный массив:");        // Выводим исходный массив
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();}
        int heightToRemove = random.nextInt(height);// Генерируем случайные индексы для удаления строки и столбца
        int lengthToRemove = random.nextInt(length);
        System.out.println("Удаляем строку: " + heightToRemove + ", столбец: " + lengthToRemove);
        // Создаем новый массив с удаленной строкой и столбцом
        int[][] newArray = new int[height - 1][length - 1];
        for (int i = 0, newHeight = 0; i < height; i++) {
            if (i == heightToRemove) continue; // Пропускаем удаляемую строку
            for (int j = 0, newLength = 0; j < length; j++) {
                if (j == lengthToRemove) continue; // Пропускаем удаляемый столбец
                newArray[newHeight][newLength] = array[i][j];
                newLength++;}
            newHeight++;}
        System.out.println("Новый массив:");
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                System.out.print(newArray[i][j] + "\t");}
            System.out.println();
        }
    }
}