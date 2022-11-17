package genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	@DataProvider(name = "testdata")
	public Object[][] Reading(String filePath, String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
		File excel=new File(filePath);
		Workbook workbook=WorkbookFactory.create(excel);
		Sheet sheet=(Sheet) workbook.getSheet(SheetName);
		
		
		
		return null;
		
	}

}
