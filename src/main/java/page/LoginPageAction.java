package page;

import Locators.LoginPageLocators;
import common.BasePage;

public class LoginPageAction {

	private BasePage bp = new BasePage();
	private LoginPageLocators lpl = new LoginPageLocators();
	
	public void PageTitle() {
		bp.getTitle();
	}

	public void clickBarMenu() throws Throwable {
		bp.clickElement(lpl.getBarMenuIcon());
	}
	
	public void clickBarMenuTabs() throws Throwable {
		bp.clickListOfElements(lpl.getBarMenuTabs());
	}
	
	public void clickBackToSignInPage() throws Throwable {
		bp.clickElement(lpl.getBackToSignInPage());
	}
	
	public boolean checkUnDisplay() throws Throwable {
		return bp.displayElement(lpl.getUsername());
	}
	
	public boolean checkPwdDisplay() throws Throwable {
		return bp.displayElement(lpl.getPassword());
	}
	
	public void doLogin(String username, String password) throws Throwable {
		bp.ClearTextField(lpl.getUsername());
		bp.SendKeys(lpl.getUsername(), username);
		bp.ClearTextField(lpl.getPassword());
		bp.SendKeys(lpl.getPassword(), password);
		bp.ActionClass(lpl.getSubmitButton()).click().click().perform();
	}
	
	public void getInvalidErrorMessage() throws Throwable {
		System.out.println(bp.getElementText(lpl.getInvalidErrorMessage()));
	}
	public void getPasswordResetButton() throws Throwable {
		bp.displayElement(lpl.getPasswordResetButton());
	}
	public void clickPasswordResetButton() throws Throwable {
		bp.clickElement(lpl.getPasswordResetButton());
	}
	public void getPrivacyPolicy() throws Throwable {
		bp.displayElement(lpl.getPrivacyPolicy());
	}
	public void getTermsCondition() throws Throwable {
		bp.displayElement(lpl.getTermsCondition());
	}
}
