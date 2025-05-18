package Timus_task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        // Список для хранения иероглифов
        List<String> kanjiList = new ArrayList<>();

        // Считываем иероглифы
        for (int i = 0; i < N; i++) {
            String kanji = scanner.nextLine();
            kanjiList.add(kanji);
        }

        // Считываем введенную букву
        String inputChar = scanner.nextLine();

        // Выводим иероглифы, начинающиеся с введенной буквы
        for (String kanji : kanjiList) {
            if (kanji.startsWith(inputChar)) {
                System.out.println(kanji);
            }
        }
    }
}