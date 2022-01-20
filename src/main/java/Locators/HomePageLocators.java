package Locators;

import common.BasePage;

public class HomePageLocators {
	private BasePage bp = new BasePage();
	
	public String getHomeTab() throws Throwable {
		return bp.HomePageCellValue(1, 1);
	}
	
	public String getRightArrow() throws Throwable {
		return bp.HomePageCellValue(2, 1);
	}
	
	public String getLogoutTab() throws Throwable {
		return bp.HomePageCellValue(3, 1);
	}
	
	public String getPatronsTab() throws Throwable {
		return bp.HomePageCellValue(4, 1);
	}
	
	public String getSearchPatrons() throws Throwable {
		return bp.HomePageCellValue(5, 1);
	}
	
	public String getSearchButton() throws Throwable {
		return bp.HomePageCellValue(6, 1);
	}
	
	public String getSearchInputBBox() throws Throwable {
		return bp.HomePageCellValue(7, 1);
	}
	
	public String getNurseTrackinTab() throws Throwable {
		return bp.HomePageCellValue(8, 1);
	}
	public String getQuickAppsTab() throws Throwable {
		return bp.HomePageCellValue(9, 1);
	}
	public String getFormsTab() throws Throwable {
		return bp.HomePageCellValue(10, 1);
	}
	public String getSchoolProgramsTab() throws Throwable {
		return bp.HomePageCellValue(11, 1);
	}
	
	public String getPatronName() throws Throwable {
		String patronCellValue = bp.PatronCellValue(1, 3);
		return patronCellValue;
	}
}
