package lab10.task01;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadXLSX {
    public static void main(String[] args) throws IOException {
        String filepath = "src/lab10/task01/example3.xlsx";
        FileInputStream inputStream = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Товары");

        for(Row row: sheet){
            for(Cell cell: row){
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
    }
}