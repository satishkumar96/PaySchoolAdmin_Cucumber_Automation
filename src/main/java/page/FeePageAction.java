package page;
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import Locators.FeesLocator;
import common.BasePage;

public class FeePageAction {

	private BasePage bp = new BasePage();
	private FeesLocator fl = new FeesLocator();

	public void mouseOverFeesTab() throws Throwable {
		bp.ActionClass(fl.getFeesTab()).perform();
	}

	public boolean verifyFeesTab() throws Throwable {
		return bp.displayElement(fl.getFeesTab());

	}

	public void mouseOverAdminOption() throws Throwable {
		bp.ActionClass(fl.getAdministratorOption()).perform();
	}

	public void selectManageFees() throws Throwable {
		bp.ActionClass(fl.getManageFeesOption()).click().perform();
	}
	public void ManageFeesHeading() throws Throwable {
		bp.getElementText(fl.getManageFeesHomePage());
	}
	public boolean  verifySearchBox() throws Throwable {
		return bp.displayElement(fl.getSearchTextBoc());
	}
	public void enterInSearchBox(String searchText) throws Throwable {
		bp.SendKeys(fl.getSearchTextBoc(), searchText);
	}
	public void clickFirstSchool() throws Throwable {
		bp.clickElement(fl.getFirstSchool());
	}
	public void clickEditAction() throws Throwable {
		bp.clickElement(fl.getEditActionButton());
	}
	public boolean veriyChooseFees() throws Throwable {
		return bp.displayElement(fl.getChooseFeeType());
	}
	public void selectAssignedFees() throws Throwable {
		bp.clickElement(fl.getAssignedFees());
//		bp.clickElement(fl.getYesButton());

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
	public void clickStartButton() throws Throwable {
		bp.ActionClass(fl.getStartButton()).click().click().perform();
	}
	public void enterFeeName() throws Throwable {
		bp.ClearTextField(fl.getFeeName());
		bp.SendKeys(fl.getFeeName(), "school");
	}
	public void enterFeeCode() throws Throwable {
		bp.ClearTextField(fl.getFeeCode());
		bp.SendKeys(fl.getFeeCode(), "SCH123454");
	}
	public void enterFeeDescription() throws Throwable {
		bp.ClearTextField(fl.getFeeDescription());
		bp.SendKeys(fl.getFeeDescription(), "This is a school fees");
	}
	public void clickFeeCategory() throws Throwable {
		bp.clickElement(fl.getFeeCategory());
	}
	public void enterFeeCategoryName() throws Throwable {
		bp.SendKeys(fl.getFeeCategoryName(), "Tution Fees");
	}
	public void enterFeeCategoryDescription() throws Throwable {
		bp.SendKeys(fl.getFeeCategoryDescription(), "Tution Fees 001");

		Thread.sleep(3000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

	}
	public void clickFeeType() throws Throwable {
		bp.clickElement(fl.getEditFeeTypeButton());
	}
	public void enterFeeTypeName() throws Throwable {
		bp.ClearTextField(fl.getEditFeeTypeName());
		bp.SendKeys(fl.getEditFeeTypeName(), "Admission Fees");
	}
	public void enterFeeTypeDescription() throws Throwable {
		bp.ClearTextField(fl.getEditFeeTypeDescription());
		bp.SendKeys(fl.getEditFeeTypeDescription(), "Admission Fees 001");
	}
	public void enterDeniedPrice() throws Throwable {
		bp.ClearTextField(fl.getDeniedPrice());
		bp.SendKeys(fl.getDeniedPrice(), "100");
	}
	public void enterReducedPrice() throws Throwable {
		bp.ClearTextField(fl.getReducedPrice());
		bp.SendKeys(fl.getReducedPrice(), "90");
	}
	public void enterFreePrice() throws Throwable {
		bp.ClearTextField(fl.getFreePrice());
		bp.SendKeys(fl.getFreePrice(), "80");
	}
	public void verifyDeniedPriceButtons() throws Throwable {
		bp.clickListOfElements(fl.getDeniedPriceButtons());
	}
	public void verifyReducedPriceButtons() throws Throwable {
		bp.clickListOfElements(fl.getReducedPriceButtons());
	}
	public void verifyFreePriceButtons() throws Throwable {
		bp.clickListOfElements(fl.getFreePriceButtons());
	}
	public void clickSaveButton() throws Throwable {

		if(bp.elementStatus(fl.getSaveButton())==true) {

			bp.clickElement(fl.getSaveButton());
		}
		else if (bp.elementStatus(fl.getSaveButton())==false) {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		}
	}
	public void clickNextButton() throws Throwable {
		bp.clickElement(fl.getNextButton());
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public boolean verifyAmountInstallation() throws Throwable {
		return bp.displayElement(fl.getFixedButton());
	}
	public void clickFixedButton() throws Throwable {
		bp.clickElement(fl.getFixedButton());
	}
	public void enterAmountDue() throws Throwable {
		bp.ClearTextField(fl.getAmountDue());
		bp.SendKeys(fl.getAmountDue(), "9999");
	}
	public void checkAllowScheduling() throws Throwable {
		bp.clickElement(fl.getAllowSchedulingCheckBox());
	}
	public void clickPartialPayment() throws Throwable {
		bp.clickElement(fl.getPartialPaymentToggleButton());
	}
	public void clickTieredButton() throws Throwable {
		bp.clickElement(fl.getTieredButton());
	}
	public void enterFree() throws Throwable {
		bp.ClearTextField(fl.getFree());
		bp.SendKeys(fl.getFree(), "100");
	}
	public void enterReduced() throws Throwable {
		bp.ClearTextField(fl.getReduced());
		bp.SendKeys(fl.getReduced(), "100");
	}
	public void enterDenied() throws Throwable {
		bp.ClearTextField(fl.getDenied());
		bp.SendKeys(fl.getDenied(), "100");
	}
	public void verifyFreeButtons() throws Throwable {
		bp.clickListOfElements(fl.getFreeButtons());
	}
	public void verifyReducedButtons() throws Throwable {
		bp.clickListOfElements(fl.getReducedButtons());
	}
	public void verifyDeniedButtons() throws Throwable {
		bp.clickListOfElements(fl.getDeniedButtons());
	}
	public void clickVariableButton() throws Throwable {
		bp.clickElement(fl.getVariableButton());
	}
	public void getVariableText() throws Throwable {
		bp.getElementText(fl.getVariableText());
	}
	
	public void goToHomePage() throws Throwable {
		bp.clickElement(fl.getHomeButton());
	}
}