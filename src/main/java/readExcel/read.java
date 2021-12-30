package readExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/patonExport.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("patonExport");

		for(int i=1; i<=sheet.getLastRowNum()+1;i++) {
			System.out.println(sheet.getRow(i).getCell(5).getStringCellValue()+":  "+
					sheet.getRow(i).getCell(3).getStringCellValue());
		}

	}

}
