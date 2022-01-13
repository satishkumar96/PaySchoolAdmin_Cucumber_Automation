package page;

import Locators.ViewPatronLocators;
import common.BasePage;

public class ViewPatronAction {

	private BasePage bp = new BasePage();

	private ViewPatronLocators vpl = new ViewPatronLocators();
	
	public void checkFirstPatron() throws Throwable {
		boolean firstPatron = bp.displayElement(vpl.getFirstPatron());
		if(firstPatron == true)
		{
			System.out.println("Display first patron ");
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	public void selectFirstPatron() throws Throwable {
		bp.clickElement(vpl.getFirstPatron());
	}
	
	public void selectQuickLunchRest() throws Throwable {
		bp.clickElement(vpl.getQuickLunchRest());
	}
	
	public void checkDailySpenLimit() throws Throwable {
		bp.SendKeys(vpl.getDailySpenLimit(), "123456");
	}
	
	public void checkRadioButtons() throws Throwable {
		bp.clickListOfElements(vpl.getNoALaCarte());
		bp.clickListOfElements(vpl.getNoBreakFast());
		bp.clickListOfElements(vpl.getNoSecondMeal());
	}
	
	public void checkDropDown() throws Throwable {
		bp.ActionClass(vpl.getItemGroupsNotAllowed()).click().perform();
		Thread.sleep(2000);
		bp.clickListOfElements(vpl.getItemGroupsNotAllowedList());
		Thread.sleep(2000);
		bp.ActionClass(vpl.getItemGroupsNotAllowed()).click().perform();
		
		Thread.sleep(3000);
		
		bp.ActionClass(vpl.getItemsNotAllowed()).click().perform();
		Thread.sleep(2000);
		bp.clickListOfElements(vpl.getItemsNotAllowedList());
		Thread.sleep(2000);
		bp.ActionClass(vpl.getItemsNotAllowed()).click().perform();
	}
	
	public void clickReport() throws Throwable {
		bp.clickElement(vpl.getReportsTab());
	}
}
