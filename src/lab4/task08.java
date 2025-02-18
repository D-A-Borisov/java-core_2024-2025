package lab4;
import java.util.Scanner;
public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String inputText = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.print("Выполнить обратное преобразование? (y/n): ");
        char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                String decryptedText = encrypt(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
            } else if (choice == 'n') {
                System.out.println("До свидания!");
            } else {
                System.out.println("Введите корректный ответ");
            }scanner.close();}
    public static String encrypt(String text, int key) { // Метод для шифрования и дешифрования текста
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base;
                if (Character.UnicodeScript.of(character) == Character.UnicodeScript.CYRILLIC) {
                    base = 'а'; // База для русских букв
                    character = (char) ((character - base + key) % 32 + base);
                } else {
                    base = 'a'; // База для английских букв
                    character = (char) ((character - base + key) % 26 + base);
                }
            }result.append(character);
        }return result.toString();
    }
}