package page;

import Locators.AccountPageLocator;
import common.BasePage;

public class AccountPageAction {

	private AccountPageLocator apl = new AccountPageLocator();
	private BasePage bp = new BasePage();
	
	public void displayAccountTab() throws Throwable {
		bp.displayElement(apl.getAccountTab()); 
	}
	public void clickAccountTab() throws Throwable {
		bp.clickElement(apl.getAccountTab());
	}
	public void addPatronAccount() throws Throwable {
		bp.clickElement(apl.getAddPatronAccount());
	}
	public void initialBalance() throws Throwable {
		bp.SendKeys(apl.getInitialBalance(), "10");
	}
	public void initialBalanceNote() throws Throwable {
		bp.SendKeys(apl.getInitialBalaceNote(), "test");
	}
	public void insertButton() throws Throwable {
		bp.clickElement(apl.getInsertButton());
	}
	public void refreshButton() throws Throwable {
		bp.clickElement(apl.getRefreshButton());
	}
	public void clickEditButton() throws Throwable {
		bp.clickElement(apl.getEditButton());
	}
	public void amountToAdjust() throws Throwable {
		bp.SendKeys(apl.getAmountToAdjust(), "10");
	}
	public void adjustmentNote() throws Throwable {
		bp.SendKeys(apl.getAdjustmentNote(), "retest");
	}
	public void clickSaveButton() throws Throwable {
		bp.clickElement(apl.getSaveButton());
	}
}
