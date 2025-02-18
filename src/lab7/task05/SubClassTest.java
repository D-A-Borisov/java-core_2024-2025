package lab7.task05;
public class SubClassTest extends SuperClassTest {
    protected int number;
    SubClassTest(String text, int number) {
        super(text);
        this.number = number;
    }
    @Override
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Значение поля: " + number + ", Текст: " + super.text);
    }
}