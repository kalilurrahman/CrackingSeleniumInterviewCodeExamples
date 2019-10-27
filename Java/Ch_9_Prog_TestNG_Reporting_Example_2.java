package com.CrackingSeleniumInterviews.TestNG.examples;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.*;

public class Ch_9_Prog_TestNG_Reporting_Example_2 {

	static FileInputStream fileInputStream;
	static FileOutputStream fileOutputStream;
	static File fileToHandle;
	private static XSSFWorkbook xssfWorkbook;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated constructor stub
		try {
			ReadXLSFiles();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			insertIntoFileExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Ch_9_Prog_TestNG_Reporting_Example_2() {
	}

	@Test
	public static void ReadXLSFiles() throws Exception {
		Workbook workbook = getSheets("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SelDataOut.xlsx");
		Cell cell;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				cell = getCellContents(workbook, "Selenium", i, j);
				printCell(cell);
				Reporter.log(" ");
			}
			Reporter.log(" ");
		}
		Reporter.log("Finished with File Handling Program");
		insertIntoFileExample();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				cell = getCellContents(workbook, "Selenium", i, j);
				printCell(cell);
				Reporter.log(" ");
			}
			Reporter.log(" ");
		}
		Reporter.log("Finished with Read into");
		workbook.close();
	}

	@Test
	public static void insertIntoFileExample() throws IOException {
		fileToHandle = new File("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SelDataOut.xlsx");
		fileInputStream = new FileInputStream(fileToHandle);
		xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
		xssfSheet.getRow(0).createCell(5).setCellValue("Test 1");
		xssfSheet.getRow(1).createCell(5).setCellValue("Test 2");
		xssfSheet.getRow(2).createCell(5).setCellValue("Test 3");
		xssfSheet.getRow(3).createCell(5).setCellValue("Test 4");
		xssfSheet.getRow(4).createCell(5).setCellValue("Test 5");
		Reporter.log("\n Wrote :::: Test 1 | Test 2 | Test 3 | Test 4 | Test 5");
		fileOutputStream = new FileOutputStream(fileToHandle);
		xssfWorkbook.write(fileOutputStream);
		fileOutputStream.close();
	}

	@Test
	private static Cell getCellContents(Workbook workbook, String SheetName, int RowId, int ColumnId) {
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(RowId);
		return row.getCell(ColumnId);
	}

	@Test
	private static Cell setCellContents(Workbook workbook, String SheetName, int RowId, int ColumnId, String cellValue)
			throws IOException {
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(RowId);
		Cell cell2 = row.createCell(ColumnId);
		cell2.setCellValue(cellValue);
		fileOutputStream = new FileOutputStream(fileToHandle);
		workbook.write(fileOutputStream);
		Reporter.log("\n Wrote :::: File " + cellValue);
		return cell2;
	}

	@Test
	private static Workbook getSheets(String fileName) throws IOException {
		fileInputStream = new FileInputStream(fileName);
		return WorkbookFactory.create(fileInputStream);
	}

	@Test
	private static Workbook writeSheets(String fileName) throws IOException {
		fileToHandle = new File(fileName);
		return WorkbookFactory.create(fileToHandle);
	}

	public static void printCell(Cell cell) {
		switch (cell.getCellType()) {
		case BOOLEAN:
			System.out.print(cell.getBooleanCellValue());
			Reporter.log("\n Wrote :::: Boolean ");
			break;
		case STRING:
			Reporter.log(cell.getRichStringCellValue().getString());
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				System.out.print(cell.getDateCellValue());
				Reporter.log("\n Wrote :::: Date ");
			} else {
				System.out.print(cell.getNumericCellValue());
				Reporter.log("\n Wrote :::: Numeric ");
			}
			break;
		case FORMULA:
			Reporter.log(cell.getCellFormula());
			break;
		case BLANK:
			Reporter.log("");
			break;
		default:
			Reporter.log("");
		}
	}

}
