package lab11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task07 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список, " +
                "строк и возвращает новый, содержащий только те строки, " +
                "которые начинаются с большой буквы список.";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int length = in.nextInt();
        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");

        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterLengthStrings(strings, length);
        System.out.println("\n" + "Строка после преобразования : " + "\n");

        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterLengthStrings(List<String> list, Integer length) {
        return list.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}