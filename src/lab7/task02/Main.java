package lab7.task02;
public class Main {
    public static void main(String[] args) {
        SuperClassTest superClass =
                new SuperClassTest("Текст суперкласса");
        System.out.println("Текст: " + superClass.getText());
        System.out.println("Длина текста в SuperClass: " + superClass.getTextLength());
        SubClassTest subClass =
                new SubClassTest(42, "Текст подкласса");
        System.out.println("Текст: " + subClass.getText());
        System.out.println("Длина текста в SubClass: " + subClass.getTextLength());
        System.out.println("Число в SubClass: " + subClass.number);
        subClass.setTextAndNumber("Новый текст", 100);
        System.out.println("Обновленный текст: " + subClass.getText());
        System.out.println("Обновленная длина текста в SubClass: " + subClass.getTextLength());
        System.out.println("Обновленное число в SubClass: " + subClass.number);
    }
}