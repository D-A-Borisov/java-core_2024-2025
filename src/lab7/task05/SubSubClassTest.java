package lab7.task05;
public class SubSubClassTest extends SuperClassTest {
    protected char character;
    SubSubClassTest(String text, char character) {
        super(text);
        this.character = character;
    }
    @Override
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Символ: " + character + ", Текст: " + super.text);
    }
}