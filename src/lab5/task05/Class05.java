package lab5.task05;
public class Class05 {
    private int number;
    public void setNumber() {
        this.number = 0;
        System.out.printf("Вызов метода без аргументов: %d\n", this.number);}
    public void setNumber(int number) {
        if (number >= 100) {
            this.number = 100;
        } else {
            this.number = number;
        }
        System.out.printf("Вывод с 1 аргументов: %d\n", this.number);}
    public void checkNumber() {
        System.out.println(this.number);
    }
}