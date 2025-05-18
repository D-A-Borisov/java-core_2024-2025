package Timus_task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1567 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line = consoleReader.readLine();
        consoleReader.close();

        int[] costMap = {1, 2, 3};
        String[] groups = {
                "adgjmpsvy. ",  // группа за 1
                "behknqtwz,",   // группа за 2
                "cfilorux!"      // группа за 3
        };

        int cost = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            for (int j = 0; j < groups.length; j++) {
                if (groups[j].indexOf(c) != -1) {
                    cost += costMap[j];
                    break;
                }
            }
        }

        System.out.println(cost);
    }
}