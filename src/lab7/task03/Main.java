package lab7.task03;
public class Main {
    public static void main(String[] args) {
        SuperClassTest superClass =
                new SuperClassTest(10);
        System.out.println(superClass);
        SubClassTest subClassTest =
                new SubClassTest(20, 'A');
        System.out.println(subClassTest); // Вывод информации о подклассе
        SubSubClassTest subSubClass =
                new SubSubClassTest(30, 'B', "Hello");
        System.out.println(subSubClass); // Вывод информации о подклассе второго уровня
        // Использование методов для изменения значений
        subSubClass.setValues(40, 'C', "World");
        System.out.println("После изменения значений:");
        System.out.println(subSubClass); // Вывод обновленной информации
    }
}