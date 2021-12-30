package Locators;

import common.BasePage;

public class HomePageLocators {
	private BasePage bp = new BasePage();
	
	public String getHomeTab() throws Throwable {
		String HomeTab = bp.HomePageCellValue(1, 1);
		
		return HomeTab;
	}
	
	public String getRightArrow() throws Throwable {
		String ArrowButton = bp.HomePageCellValue(2, 1);
		
		return ArrowButton;
	}
	
	public String getLogoutTab() throws Throwable {
		String LogoutTab = bp.HomePageCellValue(3, 1);
		
		return LogoutTab;
	}
	
	public String getPatronsTab() throws Throwable {
		String PatronsTab = bp.HomePageCellValue(4, 1);
		
		return PatronsTab;
	}
	
	public String getSearchPatrons() throws Throwable {
		String SearchPatron = bp.HomePageCellValue(5, 1);
		
		return SearchPatron;
	}
	
	public String getSearchButton() throws Throwable {
		String SearchButton = bp.HomePageCellValue(6, 1);
		
		return SearchButton;
	}
	
	public String getSearchInputBBox() throws Throwable {
		String SearchInputBox = bp.HomePageCellValue(7, 1);
		
		return SearchInputBox;
	}
	
	public String getPatronName() throws Throwable {
		String patronCellValue = bp.PatronCellValue(1, 3);
		return patronCellValue;
	}
}
