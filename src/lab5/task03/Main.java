package lab5.task03;
public class Main {
    public static void main(String[] args) {
        // Создание объектов с различными конструкторами
        Class03 obj1 = new Class03(); // Конструктор без аргументов
        Class03 obj2 = new Class03(5); // Конструктор с одним аргументом
        Class03 obj3 = new Class03(10, 20); // Конструктор с двумя аргументами
        // Вывод значений полей для каждого объекта
        System.out.println("Результат 1:");
        obj1.displayValues(); // Вывод: First Number: 0, Second Number: 0
        System.out.println("\nРезультат 2:");
        obj2.displayValues(); // Вывод: First Number: 5, Second Number: 0
        System.out.println("\nРезультат 3:");
        obj3.displayValues(); // Вывод: First Number: 10, Second Number: 20
    }
}