package lab7.task04;
public class SuperClassTest {
    public char symbol;
    // Конструктор с параметрами
    SuperClassTest(char symbol) {
        this.symbol = symbol;
    }
    // Конструктор копирования
    SuperClassTest(SuperClassTest other) {
        this.symbol = other.symbol;
    }
    public char getSymbol() {
        return symbol;
    }
}