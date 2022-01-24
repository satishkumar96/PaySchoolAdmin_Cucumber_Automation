package common;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.environment;
import readExcel.readExcel;

public class BasePage {

	private readExcel re = new readExcel();

	public String LoginPageCellValue(int row, int cell) throws Throwable {
		String CellValue = re.getLoginPageSheet().getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}


	public String HomePageCellValue(int row, int cell) throws Throwable {
		String CellValue = re.getHomePageSheet().getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}

	public String PatronCellValue(int row, int cell) throws Throwable {
		String CellValue = re.getPatronSheet().getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}

	public String ViewPatronCellValue(int row, int cell) throws Throwable {
		String CellValue = re.getViewPatronSheet().getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}

	public String AdminManageFees(int row,int cell) throws Throwable {
		return re.getAdminManageFessSheet().getRow(row).getCell(cell).getStringCellValue();
	}
	public String Account(int row,int cell) throws Throwable
	{
		return re.getAccountSheet().getRow(row).getCell(cell).getStringCellValue();
	}

	public static WebElement webdriverwaitForElement(String xpathValue) {
		WebElement element = new WebDriverWait(environment.driver, Duration.ofSeconds(100)).
				until(driver -> driver.findElement(By.xpath(xpathValue)));
		return element;
	}
	public static List<WebElement> webdriverwaitForElements(String xpathValue) {
		List<WebElement> elements = new WebDriverWait(environment.driver, Duration.ofSeconds(100)).
				until(driver -> driver.findElements(By.xpath(xpathValue)));

		return elements;
	}
	public void clickElement(String xpathValue) {
		BasePage.webdriverwaitForElement(xpathValue).click();
	}

	public void getTitle() {
		System.out.println(environment.driver.getTitle());
	}

	public void clickListOfElements(String xpathValue) {
		List<WebElement> elements = BasePage.webdriverwaitForElements(xpathValue);

		for(WebElement ele: elements) {
			ele.click();
		}
	}

	public void ClearTextField(String xpathValue) {
		BasePage.webdriverwaitForElement(xpathValue).clear();
	}

	public void SendKeys(String xpathValue, String text) {
		BasePage.webdriverwaitForElement(xpathValue).sendKeys(text);
	}

	public boolean displayElement(String xpathValue) {
		boolean bool = BasePage.webdriverwaitForElement(xpathValue).isDisplayed();
		return bool;
	}

	public boolean enableElement(String xpathValue) {
		return BasePage.webdriverwaitForElement(xpathValue).isEnabled();
	}

	public boolean selectCheckBox(String xpathValue) {
		return BasePage.webdriverwaitForElement(xpathValue).isSelected();
	}

	public String getElementText(String xpathValue) {
		String elementText = BasePage.webdriverwaitForElement(xpathValue).getText();

		return elementText;
	}

	public Actions ActionClass(String xpathValue) {
		Actions act = new Actions(environment.driver).moveToElement(BasePage.webdriverwaitForElement(xpathValue));

		return act;
	}
	public boolean elementStatus(String xpathValue) {
		return environment.driver.findElement(By.xpath(xpathValue)).isEnabled();
	}
}
