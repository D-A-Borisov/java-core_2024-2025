package lab6.Task07;
public class Main {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        int[] intArray = Class07.charArrayToIntArray(charArray);
        System.out.println("Коды символов:");
        for (int code : intArray) {
            System.out.println(code);
        }
    }
}