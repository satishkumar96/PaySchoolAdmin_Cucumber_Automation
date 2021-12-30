package Locators;

import common.BasePage;

public class LoginPageLocators {
	
	private BasePage bp = new BasePage();

	public String getBarMenuIcon() throws Throwable {

		String BarMenuIcon = bp.LoginPageCellValue(1, 1);
		
		return BarMenuIcon;
	}
	
	public String getBarMenuTabs() throws Throwable {
		String BarMenuTabs = bp.LoginPageCellValue(2, 1);
		
		return BarMenuTabs;
	}
	public String getBackToSignInPage() throws Throwable {
		String BackToSignInPage = bp.LoginPageCellValue(3, 1);
		return BackToSignInPage;
	}
	
	public String getUsername() throws Throwable {
		String username = bp.LoginPageCellValue(4, 1);
		
		return username;
	}
	
	public String getPassword() throws Throwable {
		String password = bp.LoginPageCellValue(5, 1);
		
		return password;
	}
	
	public String getSubmitButton() throws Throwable {
		String submitBtn = bp.LoginPageCellValue(6, 1);
		
		return submitBtn;
	}
	
	public String getInvalidErrorMessage() throws Throwable {
		String InvalidErrorMessage = bp.LoginPageCellValue(7, 1);
		return InvalidErrorMessage;
		
		
	}
}
