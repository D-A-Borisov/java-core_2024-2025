package lab6.task01;
public class Main {
        public static void main(String[] args) {
            Class01 Object = new Class01();
            Object.setValue('A');
            Object.displayValues();
            Object.setValue("Hello, World!");
            Object.displayValues();
            Object.setValue(new char[] {'B'});
            Object.displayValues();
            Object.setValue(new char[] {'H', 'e', 'l', 'l', 'o'});
            Object.displayValues();
        }
}