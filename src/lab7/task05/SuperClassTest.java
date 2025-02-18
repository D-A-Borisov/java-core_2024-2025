package lab7.task05;
public class SuperClassTest {
    protected String text;

    SuperClassTest(String text) {
        this.text = text;
    }
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Значение поля: " + text);
    }
}