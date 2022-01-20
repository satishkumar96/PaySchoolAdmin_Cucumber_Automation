package page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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

		do {
			bp.ActionClass(hpl.getRightArrow()).perform();
		}while(bp.displayElement(hpl.getLogoutTab()));

		bp.clickElement(hpl.getLogoutTab());

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
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
