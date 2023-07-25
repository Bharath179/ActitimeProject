package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetFistAndLastCellLimitationsInRow {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("fbdata");
		Row dayRow = sheet.getRow(0);
		short firstdaycell = dayRow.getFirstCellNum();
		System.out.println(firstdaycell);
		short lastdaycell = dayRow.getLastCellNum();
		System.out.println(lastdaycell);
	    workbook.close();
}
}
