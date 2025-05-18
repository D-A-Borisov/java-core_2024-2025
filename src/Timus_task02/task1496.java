package Timus_task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> submissionCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String teamName = scanner.nextLine();
            submissionCount.put(teamName, submissionCount.getOrDefault(teamName, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : submissionCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}