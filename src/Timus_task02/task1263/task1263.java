package Timus_task02.task1263;

import java.io.*;

public class task1263 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus_task02/task1263/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String[] str = bufferedReader.readLine().split(" ");
            int countCandidates = Integer.parseInt(str[0]);
            int countVoters = Integer.parseInt(str[1]);

            int[] counting = new int[countCandidates];

            for (int i = 0; i < countVoters; i++) {
                int number = Integer.parseInt(bufferedReader.readLine());
                counting[number-1]++;
            }

            for (int i = 0; i < counting.length; i++) {
                float percent = (100 * (float) counting[i]) / countVoters;
                System.out.println(String.format("%.2f%%", percent));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}