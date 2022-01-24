package readExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static XSSFWorkbook getLocatorWorkBook() throws Throwable {
		FileInputStream fis = new FileInputStream("./src/main/resources/LocatorsValue.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		return wb;
	}

	public static XSSFWorkbook getPatronWorkBook() throws Throwable {
		FileInputStream fis = new FileInputStream("./src/main/resources/patonExport.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		return wb;
	}

	public XSSFSheet getLoginPageSheet() throws Throwable {
		XSSFSheet LoginPageSheet = readExcel.getLocatorWorkBook().getSheet("LoginPage");
		return LoginPageSheet;
	}

	public XSSFSheet getHomePageSheet() throws Throwable {
		XSSFSheet HomePageSheet = readExcel.getLocatorWorkBook().getSheet("HomePage");
		return HomePageSheet;
	}

	public XSSFSheet getViewPatronSheet() throws Throwable {
		XSSFSheet ViewPatron = readExcel.getLocatorWorkBook().getSheet("ViewPatron");
		return ViewPatron;
	}

	public XSSFSheet getPatronSheet() throws Throwable {
		XSSFSheet patonExport = readExcel.getPatronWorkBook().getSheet("patonExport");
		return patonExport;
	}
	public XSSFSheet getAdminManageFessSheet() throws Throwable {
		return readExcel.getLocatorWorkBook().getSheet("AdminManageFees");
	}
	public XSSFSheet getAccountSheet() throws Throwable {
		return readExcel.getLocatorWorkBook().getSheet("Accounts");
	}

}
