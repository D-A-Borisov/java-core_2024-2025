package lab5.task02;
public class Class02 {
    // Класс с двумя символьными полями
    private char startChar;
    private char endChar;
    // Конструктор для инициализации полей
    public Class02(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;}
    // Метод для вывода символов между startChar и endChar
    public void printCharacters() {
        while (startChar <= endChar) {
            System.out.print(startChar + " ");
            startChar++; // Переходим к следующему символу
        }
    }
}