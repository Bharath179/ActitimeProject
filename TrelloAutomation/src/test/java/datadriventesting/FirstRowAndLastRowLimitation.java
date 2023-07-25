package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstRowAndLastRowLimitation {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("fbdata");
	int firstRowIndex = sheet.getFirstRowNum();
	System.out.println(firstRowIndex);
	int lastRowIndex = sheet.getLastRowNum();
	System.out.println(lastRowIndex);
    workbook.close();
}
}
