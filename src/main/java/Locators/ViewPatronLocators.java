package Locators;

import common.BasePage;

public class ViewPatronLocators {
	private BasePage bp = new BasePage();

	public String getFirstPatron() throws Throwable {
		String firstPatron = bp.ViewPatronCellValue(1, 1);

		return firstPatron;
	}

	public String getQuickLunchRest() throws Throwable {
		return bp.ViewPatronCellValue(2, 1);
	}

	public String getDailySpenLimit() throws Throwable {
		return bp.ViewPatronCellValue(3, 1);
	}

	public String getNoALaCarte() throws Throwable {
		return bp.ViewPatronCellValue(4, 1);
	}

	public String getNoBreakFast() throws Throwable {
		return bp.ViewPatronCellValue(5, 1);
	}

	public String getNoSecondMeal() throws Throwable {
		return bp.ViewPatronCellValue(6, 1);
	}

	public String getItemGroupsNotAllowedList() throws Throwable {
		return bp.ViewPatronCellValue(7, 1);
	}

	public String getItemsNotAllowedList() throws Throwable {
		return bp.ViewPatronCellValue(8, 1);
	}
	
	public String getItemGroupsNotAllowed() throws Throwable {
		return bp.ViewPatronCellValue(9, 1);
	}
	
	public String getItemsNotAllowed() throws Throwable {
		return bp.ViewPatronCellValue(10, 1);
	}
	
	public String getReportsTab() throws Throwable {
		return bp.ViewPatronCellValue(11, 1);
	}
}
