package lab7.task05;
public class Main {
    public static void main(String[] args) {
        SubClassTest subClassObject =
                new SubClassTest("Привет", 65);
        SubSubClassTest subSubClassObject =
                new SubSubClassTest("Мир", 'Е');
        // Вызов метода для каждого объекта
        subClassObject.display();
        subSubClassObject.display();
        // Вызов метода через объектную переменную суперкласса
        SuperClassTest superClassRef1 = subClassObject;
        SuperClassTest superClassRef2 = subSubClassObject;
        superClassRef1.display();
        superClassRef2.display();
    }
}