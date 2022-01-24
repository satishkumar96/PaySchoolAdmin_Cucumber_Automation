package Locators;

import common.BasePage;

public class AccountPageLocator {
	private BasePage bp = new BasePage();
	
	public String getAccountTab() throws Throwable {
		return bp.Account(1, 1);
	}
	public String getAddPatronAccount() throws Throwable {
		return bp.Account(2, 1);
	}
	public String getRefreshButton() throws Throwable {
		return bp.Account(3, 1);
	}
	public String getInitialBalance() throws Throwable {
		return bp.Account(4, 1);
	}
	public String getInitialBalaceNote() throws Throwable {
		return bp.Account(5, 1);
	}
	public String getInsertButton() throws Throwable {
		return bp.Account(6, 1);
	}
	public String getCancelButton() throws Throwable {
		return bp.Account(7, 1);
	}
	public String getEditButton() throws Throwable {
		return bp.Account(8, 1);
	}
	public String getAmountToAdjust() throws Throwable {
		return bp.Account(9, 1);
	}
	public String getAdjustmentNote() throws Throwable {
		return bp.Account(10, 1);
	}
	public String getSaveButton() throws Throwable {
		return bp.Account(11, 1);
	}
}
