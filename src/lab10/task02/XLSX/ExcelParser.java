package lab10.task02.XLSX;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Создать новый Excel-файл");
            System.out.println("2. Прочитать данные из Excel-файла");
            System.out.println("3. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createExcelFile(scanner);
                    break;
                case 2:
                    readExcelFile(scanner);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    // Метод для создания нового Excel-файла
    private static void createExcelFile(Scanner scanner) {
        String filepath = "src/lab10/task02/XLSX/excel.xlsx";

        try (XSSFWorkbook workbook = new XSSFWorkbook();
             FileOutputStream outputStream = new FileOutputStream(filepath)) {

            // Создаем новый лист в книге
            Sheet sheet = workbook.createSheet("Товары");

            // Записываем данные в ячейки
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Цена");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500.00);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i7, ОЗУ: 32 ГБ DDR4, Видеокарта: NVIDIA RTX 5090");
            dataRow2.createCell(2).setCellValue(250000.00);

            workbook.write(outputStream);
            System.out.println("Данные записаны в файл: " + filepath);

        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
            System.err.println("Проверьте путь к файлу и права доступа.");
        }
    }

    // Метод для чтения данных из Excel-файла
    private static void readExcelFile(Scanner scanner) {
        System.out.print("Введите путь к файлу: ");
        String filepath = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(filepath);
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {

            // Получаем первый лист
            Sheet sheet = workbook.getSheetAt(0);

            // Перебираем строки и ячейки
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            System.err.println("Проверьте путь к файлу и его формат.");
        } catch (IllegalStateException e) {
            System.err.println("Ошибка: Некорректные данные в ячейке.");
            System.err.println("Проверьте содержимое файла.");
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}