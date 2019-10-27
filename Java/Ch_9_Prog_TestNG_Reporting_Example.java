package SeleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;


/**
 * @author rahma
 *
 */
public final class Ch_9_Prog_TestNG_Reporting_Example {

	/**
	 * 
	 */
	public Ch_9_Prog_TestNG_Reporting_Example() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing TestNG Reporting");
		try {
			writeCSVFileTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readCSV();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    @Test
    public static void writeCSVFileTest() throws IOException {
        String CSV_File_Path = "SeleniumCSV2.csv";
        FileWriter fileWriter = new FileWriter(CSV_File_Path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        CSVPrinter csvPrinter = getCsvPrinter(bufferedWriter);
        updateCSVRecords(csvPrinter, "1", "Vas", "CEO", "Novartis");
        updateCSVRecords(csvPrinter, "2", "Jeff", "CEO", "Amazon");
        updateCSVRecords(csvPrinter, "3", "Tim", "CEO", "Apple");
        updateCSVRecords(csvPrinter, "4", "Satya", "CEO", "Microsoft");
        updateCSVRecords(csvPrinter, "5", "Sundar", "CEO", "Google");
        updateCSVRecords(csvPrinter, "6", "Mark", "CEO", "Facebook");
        csvPrinter.flush();
        csvPrinter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    @Test
    private static void updateCSVRecords(CSVPrinter csvPrinter, String sNo, String sName, String sTitle, String sComp) throws IOException {
        csvPrinter.printRecord(sNo, sName, sTitle, sComp);
        System.out.println("Wrote a record ::: | " + sNo + " | " + sName + " | " + sTitle + " | " + sComp );
    }

    @Test
    private static CSVPrinter getCsvPrinter(BufferedWriter bufferedWriter) throws IOException {
        return new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                    .withHeader("ID", "Name", "Designation", "Company"));
    }

    @Test
    public static void readCSV() throws IOException {
        String CSV_File_Path = "SeleniumCSV2.csv";
        // read the file
        FileReader fileReader = new FileReader(CSV_File_Path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .withIgnoreHeaderCase()
                .withTrim());

        for (CSVRecord csvRecord : csvParser) {
            // Accessing values by the names assigned to each column
            String id = csvRecord.get("id");
            String name = csvRecord.get("Name");
            String designation = csvRecord.get("Designation");
            String company = csvRecord.get("Company");
            System.out.println("Record No - " + csvRecord.getRecordNumber());
            System.out.println("---------------");
            System.out.println("Name : " + name);
            System.out.println("Designation : " + designation);
            System.out.println("Company : " + company);
            System.out.println("---------------\n\n");
        }
        csvParser.close();
        bufferedReader.close();
        fileReader.close();
    }

}

