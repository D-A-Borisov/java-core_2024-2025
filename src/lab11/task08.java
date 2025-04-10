package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task08 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число :");
        int number = in.nextInt();

        Random random = new Random();
        System.out.println("\n" + "Список до : " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(50));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = searchNumberConditions(integers, number);
        System.out.println("\n" + "Список после проверки условия : " + "\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> searchNumberConditions(List<Integer> list, Integer number) {
        return list.stream().filter(x -> x > number).collect(Collectors.toList());
    }
}