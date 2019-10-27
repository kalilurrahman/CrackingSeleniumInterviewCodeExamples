import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Ch_9_Prog_4_Selenium_POI_Example {
    static FileInputStream fileInputStream;
    static FileOutputStream fileOutputStream;
    static File fileToHandle;
    public static < exception extends Throwable > void main(String[] args) throws Exception, exception {
        Workbook workbook = getSheets("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SelData.xlsx");
//        Workbook outputworkbook = writeSheets("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SelDataOut.xlsx");
        Cell cell, cell2;
        for(int i=0; i<5; i++) {
            for(int j=0;j<5;j++) {
                cell = getCellContents(workbook, "Selenium", i, j);
                printCell(cell);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Finished with File Handling Program");
        insertIntoFileExample();
        for(int i=0; i<5; i++) {
            for(int j=0;j<6;j++) {
                cell = getCellContents(workbook, "Selenium", i, j);
                printCell(cell);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Finished with Insert into");
    }

    public static void insertIntoFileExample() throws IOException {
        fileToHandle= new File("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SelData.xlsx");
        fileInputStream = new FileInputStream(fileToHandle);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        xssfSheet.getRow(0).createCell(5).setCellValue("Test 1");
        xssfSheet.getRow(1).createCell(5).setCellValue("Test @");
        xssfSheet.getRow(2).createCell(5).setCellValue("Test 3");
        xssfSheet.getRow(3).createCell(5).setCellValue("Test 4");
        xssfSheet.getRow(4).createCell(5).setCellValue("Test 5");
        fileOutputStream = new FileOutputStream(fileToHandle);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();
    }

    private static Cell getCellContents(Workbook workbook, String SheetName, int RowId, int ColumnId) {
        Sheet sheet = workbook.getSheet(SheetName);
        Row row = sheet.getRow(RowId);
        return row.getCell(ColumnId);
    }

    private static Cell setCellContents(Workbook workbook, String SheetName, int RowId, int ColumnId, String cellValue) throws IOException {
        Sheet sheet = workbook.getSheet(SheetName);
        Row row = sheet.getRow(RowId);
        Cell cell2 = row.createCell(ColumnId);
        cell2.setCellValue(cellValue);
        fileOutputStream = new FileOutputStream(fileToHandle);
        workbook.write(fileOutputStream);
        return cell2;
    }

    private static Workbook getSheets(String fileName) throws IOException {
        fileInputStream = new FileInputStream(fileName);
        return WorkbookFactory.create(fileInputStream);
    }

    private static Workbook writeSheets(String fileName) throws IOException {
        fileToHandle= new File(fileName);
        return WorkbookFactory.create(fileToHandle);
    }

    public static void printCell(Cell cell) {
        switch (cell.getCellType()) {
            case BOOLEAN:
                System.out.print(cell.getBooleanCellValue());
                break;
            case STRING:
                System.out.print(cell.getRichStringCellValue().getString());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    System.out.print(cell.getDateCellValue());
                } else {
                    System.out.print(cell.getNumericCellValue());
                }
                break;
            case FORMULA:
                System.out.print(cell.getCellFormula());
                break;
            case BLANK:
                System.out.print("");
                break;
            default:
                System.out.print("");
        }
    }

}
