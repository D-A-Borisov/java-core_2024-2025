package lab6.Task05;
public class Class05 {
    public static void sumPowIntNumber(int number) {
        int count = 1;
        int result = 0;
        while (count <= number) {
            result += (int) Math.pow(count, 2);
            count ++;
        }
        System.out.printf("Сумма квадратов равна = %d", result);
    }
}