package lab7.task04;
public class SubSubClassTest extends SubClassTest {
    public int number;
    // Конструктор с параметрами
    SubSubClassTest(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }
    // Конструктор копирования
    SubSubClassTest(SubSubClassTest other) {
        super(other);
        this.number = other.number;
    }
    public int getNumber() {
        return number;
    }
}