package lab13.task01;

public class example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
           try {
               throw new ArithmeticException("ошибка");
           } catch (ArithmeticException error) {
            System.out.println("Исправление для репозитория " + error);
           }
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}