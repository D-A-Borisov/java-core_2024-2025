package lab7.task02;
public class SubClassTest extends SuperClassTest {
    public int number;
    SubClassTest(int number, String text) {
        super(text);
        this.number = number;
    }
    @Override
    public void setText(String text) {
        super.setText(text);
    }
    // Перегрузка метода без параметров
    public void setText() {
        super.setText("Текст по умолчанию");
    }
    // Перегрузка метода с целочисленным параметром
    public void setNumber(int number) {
        this.number = number;
    }
    // Перегрузка метода с текстовым и целочисленным параметром
    public void setTextAndNumber(String text, int number) {
        setText(text);
        setNumber(number);
    }
}