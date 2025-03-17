package lab10.task02.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.Iterator;
public class JSONBookParser {
    private String filePath;

    public JSONBookParser(String filePath) {
        this.filePath = filePath;
    }

    // Метод для добавления новой книги
    public void addBook(String title, String author, String year) {
        try {
            JSONObject jsonObject = loadJSON();
            JSONArray booksArray = (JSONArray) jsonObject.get("books");

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);

            booksArray.add(newBook);
            saveJSON(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для поиска книг по автору
    public void searchByAuthor(String author) {
        try {
            JSONObject jsonObject = loadJSON();
            JSONArray booksArray = (JSONArray) jsonObject.get("books");

            System.out.println("\nРезультаты поиска по автору '" + author + "':");
            for (Object obj : booksArray) {
                if (obj instanceof JSONObject) {
                    JSONObject book = (JSONObject) obj; // Приводим к JSONObject
                    if (author.equals(book.get("author"))) {
                        System.out.println("Название: " + book.get("title"));
                        System.out.println("Автор: " + book.get("author"));
                        System.out.println("Год издания: " + book.get("year"));
                        System.out.println();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для удаления книги по названию
    public void deleteBookByTitle(String title) {
        try {
            JSONObject jsonObject = loadJSON();
            JSONArray booksArray = (JSONArray) jsonObject.get("books");

            Iterator iterator = booksArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                    break;
                }
            }

            saveJSON(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для вывода всех книг
    public void printAllBooks() {
        try {
            JSONObject jsonObject = loadJSON();
            JSONArray booksArray = (JSONArray) jsonObject.get("books");

            System.out.println("\nСписок всех книг:");
            for (Object obj : booksArray) {
                if (obj instanceof JSONObject) {
                    JSONObject book = (JSONObject) obj; // Приводим к JSONObject
                    System.out.println("Название: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Вспомогательный метод для загрузки JSON-файла
    private JSONObject loadJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        reader.close();
        return jsonObject;
    }

    // Вспомогательный метод для сохранения JSON-файла
    private void saveJSON(JSONObject jsonObject) throws IOException {
        FileWriter file = new FileWriter(filePath);
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }
}