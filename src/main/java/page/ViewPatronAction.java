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
		bp.clickElement(vpl.getItemGroupsNotAllowed());
		bp.clickListOfElements(vpl.getItemGroupsNotAllowedList());
		bp.clickElement(vpl.getItemGroupsNotAllowed());
		
		Thread.sleep(3000);
		
		bp.clickElement(vpl.getItemsNotAllowed());
		bp.clickListOfElements(vpl.getItemsNotAllowedList());
		bp.clickElement(vpl.getItemsNotAllowed());
	}
	
	public void clickReport() throws Throwable {
		bp.clickElement(vpl.getReportsTab());
	}
}
