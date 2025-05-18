package Timus_task02.task1607;

import java.io.*;
public class task1607 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus_task02/task1607/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String[] Str = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(Str[0]);// стартовая цена Пети
            int b = Integer.parseInt(Str[1]); // надбавка Пети
            int c = Integer.parseInt(Str[2]); // стартовая цена таксиста
            int d = Integer.parseInt(Str[3]); // скидка таксиста
            int result = 0;
            // Процесс торга
            if (a > c) {
                System.out.println(a);
            } else {
                while (a <= c) {
                    if (a + b <= c) {
                        a += b;
                        result = a;
                    } else {
                        result = c;
                        break;
                    }
                    if (c - d >= a) {
                        c -= d;
                        result = a;
                    } else {
                        result = a;
                        break;
                    }
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}