package lab6.Task08;
public class Class08 {
    public static double calAverage(int[] intArray) {
        if (intArray.length == 0) {
            return 0; // Возвращаем 0, если массив пустой
        }
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return (double) sum / intArray.length;
    }
}