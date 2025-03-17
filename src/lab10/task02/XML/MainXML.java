package lab10.task02.XML;

import java.util.Scanner;
public class MainXML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        XMLBookParser xmlBookParser = new XMLBookParser("src/lab10/task02/XML/books.xml");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Найти книгу по автору");
            System.out.println("3. Найти книгу по году издания");
            System.out.println("4. Удалить книгу по названию");
            System.out.println("5. Вывести все книги");
            System.out.println("6. Выйти");
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
                    xmlBookParser.addBook(title, author, year);
                    System.out.println("Книга успешно добавлена!");
                    break;

                case 2:
                    System.out.print("Введите автора для поиска: ");
                    String searchAuthor = scanner.nextLine();
                    xmlBookParser.searchByAuthor(searchAuthor);
                    break;

                case 3:
                    System.out.print("Введите год издания для поиска: ");
                    String searchYear = scanner.nextLine();
                    xmlBookParser.searchByYear(searchYear);
                    break;

                case 4:
                    System.out.print("Введите название книги для удаления: ");
                    String deleteTitle = scanner.nextLine();
                    xmlBookParser.deleteBookByTitle(deleteTitle);
                    System.out.println("Книга успешно удалена (если существовала)!");
                    break;

                case 5:
                    xmlBookParser.printAllBooks();
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}