package lab13.task01;

public class example14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
        System.out.println(h);
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}