package lab4;
import java.util.Scanner;
public class task10 {
    private static final String ALPHABET = "0123456789!@#$%^&*()-_=+[]{}|;:',.<>?/`~";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String inputText = scanner.nextLine();
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine();
        while (true) {
            if (response.equalsIgnoreCase("y")) {
                String decryptedText = encrypt(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;} else if (response.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;} else {
                System.out.println("Введите корректный ответ");
                response = scanner.nextLine();}}scanner.close();}
    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        int alphabetLength = ALPHABET.length();
        for (char character : text.toCharArray()) {
            int index = ALPHABET.indexOf(character);
            if (index != -1) { int newIndex = (index + key) % alphabetLength;
                if (newIndex < 0) {
                    newIndex += alphabetLength;}
                result.append(ALPHABET.charAt(newIndex));} else {
                result.append(character);}}return result.toString();
    }
}