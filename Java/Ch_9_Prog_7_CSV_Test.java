import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.Test;

import static java.nio.file.Files.newBufferedReader;

public class Ch_9_Prog_7_CSV_Test {

    @Test
    public void writeCSVFileTest() throws IOException {
        String CSV_File_Path = "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SeleniumCSV.csv";
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

    private void updateCSVRecords(CSVPrinter csvPrinter, String sNo, String sName, String sTitle, String sComp) throws IOException {
        csvPrinter.printRecord(sNo, sName, sTitle, sComp);
    }

    private CSVPrinter getCsvPrinter(BufferedWriter bufferedWriter) throws IOException {
        return new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                    .withHeader("ID", "Name", "Designation", "Company"));
    }

    @Test
    public void readCSV() throws IOException {
        String CSV_File_Path = "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\SeleniumCSV.csv";
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