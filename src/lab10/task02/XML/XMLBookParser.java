package lab10.task02.XML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
public class XMLBookParser {
    private String filePath;
    public XMLBookParser(String filePath) {
        this.filePath = filePath;
    }
    // Метод для добавления новой книги
    public void addBook(String title, String author, String year) {
        try {
            Document doc = loadDocument();
            Element rootElement = doc.getDocumentElement();

            Element newBook = doc.createElement("book");

            Element newTitle = doc.createElement("title");
            newTitle.appendChild(doc.createTextNode(title));
            newBook.appendChild(newTitle);

            Element newAuthor = doc.createElement("author");
            newAuthor.appendChild(doc.createTextNode(author));
            newBook.appendChild(newAuthor);

            Element newYear = doc.createElement("year");
            newYear.appendChild(doc.createTextNode(year));
            newBook.appendChild(newYear);

            // Добавление новой книги в корневой элемент
            rootElement.appendChild(newBook);

            // Сохранение изменений в XML-файл
            saveChanges(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для поиска книг по автору
    public void searchByAuthor(String author) {
        try {
            Document doc = loadDocument();
            NodeList nodeList = doc.getElementsByTagName("book");

            System.out.println("\nРезультаты поиска по автору '" + author + "':");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element book = (Element) nodeList.item(i);
                String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();
                if (bookAuthor.equalsIgnoreCase(author)) {
                    String title = book.getElementsByTagName("title").item(0).getTextContent();
                    String year = book.getElementsByTagName("year").item(0).getTextContent();
                    System.out.println("Название: " + title + ", Год: " + year);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для поиска книг по году издания
    public void searchByYear(String year) {
        try {
            Document doc = loadDocument();
            NodeList nodeList = doc.getElementsByTagName("book");

            System.out.println("\nРезультаты поиска по году '" + year + "':");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element book = (Element) nodeList.item(i);
                String bookYear = book.getElementsByTagName("year").item(0).getTextContent();
                if (bookYear.equals(year)) {
                    String title = book.getElementsByTagName("title").item(0).getTextContent();
                    String author = book.getElementsByTagName("author").item(0).getTextContent();
                    System.out.println("Название: " + title + ", Автор: " + author);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для удаления книги по названию
    public void deleteBookByTitle(String title) {
        try {
            Document doc = loadDocument();
            NodeList nodeList = doc.getElementsByTagName("book");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element book = (Element) nodeList.item(i);
                String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();
                if (bookTitle.equalsIgnoreCase(title)) {
                    Node parentNode = book.getParentNode();
                    parentNode.removeChild(book);
                    break;
                }
            }

            // Сохранение изменений
            saveChanges(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printAllBooks() {
        try {
            Document doc = loadDocument();
            NodeList bookList = doc.getElementsByTagName("book");

            System.out.println("\nСписок всех книг:");
            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                String year = book.getElementsByTagName("year").item(0).getTextContent();

                System.out.println("Книга " + (i + 1) + ":");
                System.out.println("  Название: " + title);
                System.out.println("  Автор: " + author);
                System.out.println("  Год издания: " + year);
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Ошибка при выводе списка книг: " + e.getMessage());
        }
    }

    // Вспомогательный метод для загрузки XML-документа
    private Document loadDocument() throws Exception {
        File inputFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        return doc;
    }

    // Вспомогательный метод для сохранения изменений в XML-файл
    private void saveChanges(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }
}