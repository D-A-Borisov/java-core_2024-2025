package lab5.task03;
public class Class03 {
    private int firstNumber;
    private int secondNumber;
        public Class03(){ // Конструктор без аргументов
        this.firstNumber = 0;
        this.secondNumber = 0;}
    public Class03(int firstNumber) { // Конструктор с одним аргументом
        this.firstNumber = firstNumber;
        this.secondNumber = 0;}
    public Class03(int firstNumber, int secondNumber) { // Конструктор с двумя аргументами
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;}
    // Метод для вывода значений полей
    public void displayValues() {
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
    }
}