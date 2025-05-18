package Timus_task02.task2056;

import java.io.*;

public class task2056 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus_task02/task2056/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int length = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            boolean statNominal = true;
            boolean statScholarship = true;
            for (int i = 0; i < length; i++) {
                int score = Integer.parseInt(bufferedReader.readLine());
                result += score;
                if (score == 3) {
                    statScholarship = false;
                    break;
                } else if (score != 5) {
                    statNominal = false;
                }
            }
            if (!statScholarship) {
                System.out.println("None");
            } else if (statNominal) {
                System.out.println("Named");
            } else if (((double) result / length) >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}