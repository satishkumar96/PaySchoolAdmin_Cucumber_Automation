package page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.environment;
import Locators.HomePageLocators;
import Locators.ReportPageLocator;
import common.BasePage;

public class HomePageAction {

	private BasePage bp = new BasePage();
	private HomePageLocators hpl = new HomePageLocators();
	private ReportPageLocator rpl = new ReportPageLocator();

	public void getHomePageTitle() {
		bp.getTitle();
	}

	public void performLogout() throws Throwable {

		if(bp.displayElement(hpl.getLogoutTab())){
			bp.ActionClass(hpl.getLogoutTab()).click().click().perform();
			
			WebDriverWait wait = new WebDriverWait(environment.driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.alertIsPresent());

			Alert alert = environment.driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();

		}
		else
		{
			do 
			{
				bp.ActionClass(hpl.getRightArrow()).perform();
			}
			while(bp.displayElement(hpl.getLogoutTab()));

			bp.clickElement(hpl.getLogoutTab());

			WebDriverWait wait = new WebDriverWait(environment.driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.alertIsPresent());

			Alert alert = environment.driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
	}

	public void mouseOverPatrons() throws Throwable {
		bp.ActionClass(hpl.getPatronsTab()).perform();
	}
	public boolean HomeTab() throws Throwable {
		return bp.displayElement(hpl.getHomeTab());
	}
	public boolean PatronTab() throws Throwable {
		return bp.displayElement(hpl.getPatronsTab());
	}
	public boolean ReportTab() throws Throwable {
		return bp.displayElement(rpl.getReportsTab());
	}
	public boolean NurseTrackinTab() throws Throwable {
		return bp.displayElement(hpl.getNurseTrackinTab());
	}
	public boolean QuickAppsTab() throws Throwable {
		return bp.displayElement(hpl.getQuickAppsTab());
	}
	public boolean FormsTab() throws Throwable {
		return bp.displayElement(hpl.getFormsTab());
	}
	public boolean SchoolProgramTab() throws Throwable {
		return bp.displayElement(hpl.getSchoolProgramsTab());
	}

	public void selectSearchPatron() throws Throwable {
		bp.clickElement(hpl.getSearchPatrons());
	}

	public boolean checkSearchInputBox() throws Throwable {
		return bp.displayElement(hpl.getSearchInputBBox());
	}

	public void enterPatronName() throws Throwable {
		bp.SendKeys(hpl.getSearchInputBBox(), hpl.getPatronName());
	}

	public void clickSearchButton() throws Throwable {
		bp.clickElement(hpl.getSearchButton());
	}

	public void clickHomeTab() throws Throwable {
		bp.clickElement(hpl.getHomeTab());
	}
}
