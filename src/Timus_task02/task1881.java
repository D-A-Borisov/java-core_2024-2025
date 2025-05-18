package Timus_task02;

import java.util.Scanner;
public class task1881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // строк на странице
        int w = scanner.nextInt(); // символов в строке
        int n = scanner.nextInt(); // количество слов

        scanner.nextLine();

        int currentLineLength = 0;
        int linesUsed = 1;
        int pages = 1;

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int wordLength = word.length();

            // Проверяем, нужно ли добавлять пробел перед словом
            if (currentLineLength > 0) {
                wordLength += 1; // добавляем пробел
            }

            if (currentLineLength + wordLength <= w) {
                // Слово помещается в текущую строку
                currentLineLength += wordLength;
            } else {
                // Слово не помещается - новая строка
                linesUsed++;
                currentLineLength = word.length(); // без пробела

                // Проверяем, не заполнена ли страница
                if (linesUsed > h) {
                    pages++;
                    linesUsed = 1;
                }
            }
        }
        System.out.println(pages);
    }
}