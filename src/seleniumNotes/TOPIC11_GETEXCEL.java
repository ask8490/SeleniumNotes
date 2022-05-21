package seleniumNotes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TOPIC11_GETEXCEL {
// PARAMETERIZATION-- FETCHING DATTA FROM EXTERNAL SOURCE AND USING IT IN SELENIUM TEST SCRIPT IS KNOWN AS PARAMETERIZATION
	
// IT CAN BE ACHIEVE BY EXCEL SHEET, TEST NG DATA PROVIDER
		
// HOW TO FETCH DATA FROM EXCEL SHEET ?
	
// 1--TO FETCH DATAA FROM EXCEL SHEET 1ST WE HAAVE TO TO CONFIGURE APACHE POI JAR FILE INTO OUR PROJECT

// 2--CREATE AN EXCEL SHEET WITH SOME DATA SAVE IT IN ANY DRIVE
		
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		create an object of FileInputStream class with excel file path as argument
		FileInputStream myFile = new FileInputStream("E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\TestData\\TestDataFile.xlsx");
		
//3		To open a workbook(excel file is called as workbook) use create() method from WorkbookFactory class. Its return type is a workbook
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
//4		To open a specific sheet of workbook use getSheet() method from Workbook class. Argument required is sheet name in the form of string.its return type is Sheet
		Sheet mySheet = myWorkbook.getSheet("IndianPopulation");
		
//5		To open a specific row use getRow() method from Sheet class. Argument required is row index value in the form of integer number (Indexing starts with zero). Its return type is Row 
		Row myRow = mySheet.getRow(1);
		
//6		To open a specific cell use getCell() method from Row class. Argument required is cell index value in the form of integer number (Indexing starts with zero). Its return type is Cell
		Cell myCell = myRow.getCell(1);
		
//7		To fetch content of cell there are methods available according to data-type of the cell content. Here no argument is required. return type is among String, Double and Boolean 
		String cellValue1 = myCell.getStringCellValue();
		
		System.out.println(cellValue1); // printing value on console for reference
		
//		**********************************************************************************
//		step 3,4,5,6,7 can be combined together with the help of method chaining
		
		double cellValue2 = myWorkbook.getSheet("IndianPopulation").getRow(1).getCell(2).getNumericCellValue();
		
		System.out.println(cellValue2); // printing value on console for reference
		
//		***********************************************************************************
//		we can move through the excel sheet content by using looping statements
		
	}

}
