package lab6.Task04;
public class Class04 {
    public static void doubleFactorial(int number) {
        int result = 1;
        int new_number = number;
        for (int i = 0; i < number / 2; i++) {
            int next_number = new_number - 2;
            if (next_number == 0) {
                result *= new_number;
                new_number -= 2;
            } else if (next_number < 0) {
                continue;
            } else {
                result *= new_number * next_number;
                new_number -= 4;
            }
        }
        System.out.printf("Факторил = %d", result);
    }
}