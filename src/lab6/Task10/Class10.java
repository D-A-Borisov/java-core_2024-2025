package lab6.Task10;
public class Class10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }
}