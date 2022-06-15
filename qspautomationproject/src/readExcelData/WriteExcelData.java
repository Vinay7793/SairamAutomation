package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./Data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("validcred");
		Row rw = sh.getRow(1);

		//----------------------------------------------------------------------

		Cell cell = rw.createCell(3);
		cell.setCellValue("status");

		Cell cell2 = rw.createCell(4);
		cell.setCellValue("vinay");

		//----------------------------------------------------------------------

		FileOutputStream fos = new FileOutputStream("./Data/ActiTimeTestData.xlsx");
		wb.write(fos);
	}

}
