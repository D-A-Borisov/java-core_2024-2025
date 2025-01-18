package lab5.task04;
public class Class04 {
    private char characterField;
    private int integerField;
    public Class04(int integerValue, char characterValue) {
        this.integerField = integerValue;
        this.characterField = characterValue;
    }
    public Class04(double value) { // Конструктор с одним аргументом типа double
        this.characterField = (char) ((int) value); // Действительная часть
        this.integerField = (int) ((value - (int) value) * 100); // Дробная часть
    }
    public void display() {
        System.out.println("Символьное поле: " + characterField);
        System.out.println("Целочисленное поле: " + integerField);
    }
}