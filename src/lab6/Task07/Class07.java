package lab6.Task07;
public class Class07 {
    public static int[] charArrayToIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i]; // Преобразуем символ в его код
        }
        return intArray;
    }
}