package lab6.task01;
public class Class01 {
    private char charField;
    private String stringField;
    public void setValue(char value) {
        this.charField = value;
    }
    public void setValue(String value) {
        this.stringField = value;
    }
    public void setValue(char[] value) {
        if (value.length == 1) {
            this.charField = value[0];
        } else {
            this.stringField = new String(value);
        }
    }
    public void displayValues() {
        System.out.println("Символьное поле: " + charField);
        System.out.println("Текстовое поле: " + stringField);
    }
}