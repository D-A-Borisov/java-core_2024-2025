package lab7.task02;
public class SuperClassTest {
    private String text;
    SuperClassTest(String text) {
        this.text = text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getTextLength() {
        return this.text.length();
    }
    public String getText() {
        return text;
    }
}