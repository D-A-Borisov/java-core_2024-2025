package lab6.Task09;
public class Main {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.print("Исходный массив: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Меняем местами элементы массива
        Class09.reverseCharArray(charArray);
        System.out.print("Измененный массив: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}