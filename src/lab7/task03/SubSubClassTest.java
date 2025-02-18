package lab7.task03;
public class SubSubClassTest extends SubClassTest {
    public String text;
    SubSubClassTest(int number, char character, String text) {
        super(number, character);
        this.text = text;
    }
    public void setValues(int number, char character, String text) {
        setValues(number, character);
        this.text = text;
    }
    @Override
    public String toString() {
        return "SubSubClass: number = " + number + ", character = " + character + ", text = " + text; // Метод toString
    }
}