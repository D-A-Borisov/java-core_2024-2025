package lab7.task04;
public class Main {
    public static void main(String[] args) {
        SubSubClassTest obj = new SubSubClassTest('B', "Привет", 70);
        // Вывод значений полей
        System.out.println("Символ: " + obj.getSymbol());
        System.out.println("Текст: " + obj.getText());
        System.out.println("Число: " + obj.getNumber());
        // Создание копии объекта
        SubSubClassTest copyObj = new SubSubClassTest(obj);
        System.out.println("Копия - Символ: " + copyObj.getSymbol());
        System.out.println("Копия - Текст: " + copyObj.getText());
        System.out.println("Копия - Число: " + copyObj.getNumber());
    }
}