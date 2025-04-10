package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class task05 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список, " +
                "строк и возвращает новый, содержащий только те строки, " +
                "которые начинаются с большой буквы список.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = SearchWordStrings(strings, "список");
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> SearchWordStrings(List<String> list, String search) {
        return list.stream()
                .filter(s -> s.contains(search))
                .collect(Collectors.toList());
    }
}