package lab7.task03;
public class SubClassTest extends SuperClassTest {
    public char character;
    SubClassTest(int number, char character) {
        super(number);
        this.character = character;
    }
    public void setValues(int number, char character) {
        setNumber(number);
        this.character = character;
    }
    @Override
    public String toString() {
        return "SubClass: number = " + number + ", character = " + character; // Метод toString
    }
}