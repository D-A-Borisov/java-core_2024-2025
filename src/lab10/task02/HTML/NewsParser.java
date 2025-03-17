package lab10.task02.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class NewsParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Получить новости и сохранить в файл");
            System.out.println("2. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    parseAndSaveNews();
                    break;
                case 2:
                    exit = true;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    // Метод для парсинга новостей и сохранения их в файл
    private static void parseAndSaveNews() {
        String url = "https://urfu.ru/get-news/ru/news" +
                "/?cols=3&pid=53%2C11367%2C30302&" +
                "/categories=1%2C10%2C12%2C130%2C155%2C2%2C212%2C232%2C264%2C27%2C277%2C3%2C33%2C4%2C5%2C52%2C6%2C7%2C8%2C9%2C90%2C93%2C96&" +
                "/fullmode=1&offset=0&rows=5&selected=0&page=54&show_categories=1";

        int maxRetries = 3; // Максимальное количество попыток подключения
        int retryCount = 0;

        while (retryCount < maxRetries) {
            try {
                // Подключение к сайту и получение HTML-кода
                Document document = Jsoup.connect(url).get();
                Elements news = document.select(".news-item");

                // Запись данных в файл
                try (FileWriter writer = new FileWriter("src/lab10/task02/HTML/news.txt")) {
                    for (Element element : news) {
                        Elements dates = element.select(".date");
                        Elements snippets = element.select(".snippet a");

                        String title = snippets.getFirst().text();
                        String date = dates.getFirst().text();

                        // Вывод в консоль
                        System.out.printf("Тема: %s\nДата: %s\n", title, date);

                        // Запись в файл
                        writer.write("Тема: " + title + "\n");
                        writer.write("Дата: " + date + "\n");
                        writer.write("\n");
                    }

                    System.out.println("Данные успешно сохранены в файл news.txt");
                    break;
                } catch (IOException e) {
                    System.err.println("Ошибка при записи в файл: " + e.getMessage());
                    break;
                }

            } catch (IOException e) {
                retryCount++;
                System.err.println("Ошибка при подключении к сайту (попытка " + retryCount + " из " + maxRetries + "): " + e.getMessage());

                if (retryCount < maxRetries) {
                    System.out.println("Повторная попытка подключения...");
                } else {
                    System.err.println("Не удалось подключиться к сайту после " + maxRetries + " попыток.");
                }
            }
        }
    }
}