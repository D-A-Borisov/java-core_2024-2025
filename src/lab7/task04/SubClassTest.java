package lab7.task04;
public class SubClassTest extends SuperClassTest {
    public String text;
    // Конструктор с параметрами
    SubClassTest(char symbol, String text) {
        super(symbol);
        this.text = text;
    }
    // Конструктор копирования
    SubClassTest(SubClassTest other) {
        super(other);
        this.text = other.text;
    }
    public String getText() {
        return text;
    }
}