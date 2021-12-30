package page;

import Locators.FeesLocator;
import common.BasePage;

public class FeePageAction {

	private BasePage bp = new BasePage();
	private FeesLocator fl = new FeesLocator();

	public void mouseOverFeesTab() throws Throwable {
		bp.ActionClass(fl.getFeesTab()).perform();
	}

	public void verifyFeesTab() throws Throwable {
		boolean displayElement = bp.displayElement(fl.getFeesTab());

		if(displayElement == true)
		{
			System.out.println("Fees Tab visible");
		}
		else
		{
			System.out.println("Fees Tab not visible");
		}

	}

	public void mouseOverAdminOption() throws Throwable {
		bp.ActionClass(fl.getAdministratorOption()).perform();
	}

	public void selectManageFees() throws Throwable {
		bp.ActionClass(fl.getManageFeesOption()).click().perform();

	}
}
