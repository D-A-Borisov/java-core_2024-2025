package lab8.task02;

import java.io.*;
public class ReWriteFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lab8/task02/input.txt"), "cp1251"));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/lab8/task02/output.txt"), "cp1251"))) {
            // Чтение первой и второй строки
            br.readLine();
            String secondLine = br.readLine();
            if (secondLine != null) out.println(secondLine); // Записываем вторую строку
            // Чтение и запись положительных чисел
            String line;
            while ((line = br.readLine()) != null) {
                for (String number : line.split(" ")) {
                    try {
                        double num = Double.parseDouble(number);
                        if (num > 0) out.println(num);
                    } catch (NumberFormatException ignored) {}
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!" + e);
        }
    }
}