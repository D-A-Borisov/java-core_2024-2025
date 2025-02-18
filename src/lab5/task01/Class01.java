package lab5.task01;
public class Class01 {
    // Создание закрытой переменной
    private char character;
    // Метод для присвоения значения
    public void setCharacter(char character) {
        this.character = character;}
    // Метод для получения кода символа
    public int getCharacterCode() {
        return (int) character;}
    // Метод для вывода символа и его кода в консоль
    public void displayCharacterInfo() {
        System.out.println("Символ: " + character + ", Код символа: " + getCharacterCode());
    }
}