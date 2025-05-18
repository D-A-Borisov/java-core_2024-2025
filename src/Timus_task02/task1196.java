package Timus_task02;

import java.io.*;
import java.util.HashSet;
public class task1196 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Чтение количества записей в списке преподавателя
        int N = Integer.parseInt(reader.readLine());
        HashSet<Integer> teacherDates = new HashSet<>(N);

        for (int i = 0; i < N; i++) {
            teacherDates.add(Integer.parseInt(reader.readLine()));
        }

        // Чтение количества записей в списке студента
        int M = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 0; i < M; i++) {
            int studentDate = Integer.parseInt(reader.readLine());
            if (teacherDates.contains(studentDate)) {
                count++;
            }
        }
        System.out.println(count);
    }
}