package page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import Locators.HomePageLocators;
import common.BasePage;

public class HomePageAction {

	private BasePage bp = new BasePage();
	private HomePageLocators hpl = new HomePageLocators();

	public void getHomePageTitle() {
		bp.getTitle();
	}

	public void performLogout() throws Throwable {
		
		bp.clickElement(hpl.getLogoutTab());

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
	}
	
	public void mouseOverPatrons() throws Throwable {
		bp.ActionClass(hpl.getPatronsTab()).perform();
	}

	public void selectSearchPatron() throws Throwable {
		bp.clickElement(hpl.getSearchPatrons());
	}
	
	public void checkSearchInputBox() throws Throwable {
		boolean searchInputBox = bp.displayElement(hpl.getSearchInputBBox());
		
		if(searchInputBox == true)
		{
			System.out.println("Search Box display" +searchInputBox);
		}
		else
		{
			System.out.println("Search box not display");
		}
		
	}
	
	public void enterPatronName() throws Throwable {
		bp.SendKeys(hpl.getSearchInputBBox(), hpl.getPatronName());
	}
	
	public void clickSearchButton() throws Throwable {
		bp.clickElement(hpl.getSearchButton());
	}
}
