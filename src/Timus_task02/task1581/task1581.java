package Timus_task02.task1581;

import java.io.*;

public class task1581 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus_task02/task1581/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int length = Integer.parseInt(bufferedReader.readLine());
            String[] StringList = bufferedReader.readLine().split(" ");
            int firstNumber = Integer.parseInt(StringList[0]);
            int count = 1;
            for (int i = 1; i < length; i++) {
                int number = Integer.parseInt(StringList[i]);
                if (number == firstNumber) {
                    count++;
                } else {
                    System.out.print(count + " " + firstNumber + " ");
                    firstNumber = number;
                    count = 1;
                }
            }
            System.out.print(count + " " + firstNumber + " ");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}