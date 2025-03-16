package lab10.task02.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class MainJSON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JSONBookParser jsonBookParser = new JSONBookParser("src/lab10/task02/JSON/books.json");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Найти книгу по автору");
            System.out.println("3. Удалить книгу по названию");
            System.out.println("4. Вывести все книги");
            System.out.println("5. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите год издания: ");
                    String year = scanner.nextLine();
                    jsonBookParser.addBook(title, author, year);
                    System.out.println("Книга успешно добавлена!");
                    break;

                case 2:
                    System.out.print("Введите автора для поиска: ");
                    String searchAuthor = scanner.nextLine();
                    jsonBookParser.searchByAuthor(searchAuthor);
                    break;

                case 3:
                    System.out.print("Введите название книги для удаления: ");
                    String deleteTitle = scanner.nextLine();
                    jsonBookParser.deleteBookByTitle(deleteTitle);
                    System.out.println("Книга успешно удалена (если существовала)!");
                    break;

                case 4:
                    jsonBookParser.printAllBooks();
                    break;

                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
