package Locators;

import common.BasePage;

public class FeesLocator {
	private BasePage bp = new BasePage();
	
	public String getFeesTab() throws Throwable {
		return bp.AdminManageFees(1, 1);
	}
	
	public String getAdministratorOption() throws Throwable {
		return bp.AdminManageFees(2, 1);
	}
	
	public String getManageFeesOption() throws Throwable {
		return bp.AdminManageFees(3, 1);
	}
}
