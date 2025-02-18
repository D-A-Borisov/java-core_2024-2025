package lab8.task03;

import java.io.*;
public class ReWritePoem {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков для чтения и записи
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lab8/task03/MyFile1.txt"), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/lab8/task03/MyFile2.txt"), "UTF-8"));
            String line;
            int lineNumber = 0;
            // Чтение строк из входного файла
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Разделяем строку на слова
                StringBuilder filteredWords = new StringBuilder();
                int count = 0;
                for (String word : words) {
                    // Проверяем, начинается ли слово с согласной буквы
                    if (word.length() > 0 && isConsonant(word.charAt(0))) {
                        filteredWords.append(word).append(" ");
                        count++;
                    }
                }
                // Записываем в выходной файл номер строки и найденные слова
                out.println("Строка " + lineNumber + ": " + filteredWords.toString().trim());
                out.println("Количество слов: " + count);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка!!!" + e);
            }
        }
    }
    // Метод для проверки, является ли буква согласной
    private static boolean isConsonant(char c) {
        return "бвгджзйклмнпрстфхцчшщ".indexOf(Character.toLowerCase(c)) >= 0;
    }
}