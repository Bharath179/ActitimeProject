package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public static void main(String[] args) throws Throwable {
//	create the FileInputStream obj of java with the absolute path of the address
	FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
	//call create() from workbookfactory class of poi library
	Workbook Workbook = WorkbookFactory.create(fis);
	//call the getSheet() by specifying the sheet name
	Sheet sheet = Workbook.getSheet("mydata");
//	call getrow() by specifying the row index
	Row row = sheet.getRow(1);
	//call getcell() by specifying the cell index
	Cell cell = row.getCell(0);
	//Based on type of data call appropriate method
	//long numericValue = (long)cell.getNumericCellValue();
	//System.out.println(numericValue);
	String cellValue=cell.getStringCellValue();
	System.out.println(cellValue);
	Workbook.close();
}
}
