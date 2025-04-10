package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class task09 {
    public static void main(String[] args) {

        String string = "Напиши3те функцию, которая при43нимает на вход список, " +
                "строк и возвр47ащает новый, содержащий только те строки, " +
                "которые начинаются с большой буквы список.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");

        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterNumberStrings(strings);
        System.out.println("\n" + "Строка после преобразования : " + "\n");

        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterNumberStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.matches(".*\\d+.*"))
                .collect(Collectors.toList());
    }
}