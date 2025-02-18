package lab6.Task09;
public class Class09 {
    public static void reverseCharArray(char[] charArray) {
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];  // Меняем местами элементы
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;// Сдвигаем указатели
            right--;
        }
    }
}