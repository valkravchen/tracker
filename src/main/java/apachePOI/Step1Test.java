package apachePOI;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Step1Test {
    public static void main(String[] args) {
        try {
            System.out.println("Проверяем библиотеку Apache POI...");
            XSSFWorkbook workbook = new XSSFWorkbook();
            System.out.println("Библиотека подключена успешно!");
            System.out.println("Создана пустая Excel книга");
            System.out.println("Количество листов: " + workbook.getNumberOfSheets());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
