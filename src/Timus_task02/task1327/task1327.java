package Timus_task02.task1327;

import java.io.*;
public class task1327 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus_task02/task1327/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    result++;
                }
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}