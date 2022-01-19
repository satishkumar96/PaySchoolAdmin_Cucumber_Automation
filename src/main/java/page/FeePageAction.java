package page;
import java.awt.Robot;	
import java.awt.event.KeyEvent;

import Hooks.environment;
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
		bp.ClearTextField(fl.getSearchTextBoc());
		bp.SendKeys(fl.getSearchTextBoc(), searchText);

		Thread.sleep(2000);
		bp.ClearTextField(fl.getSearchTextBoc());
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
		
		Thread.sleep(3000);
		
//		bp.clickElement(fl.getYesButton());
//		
//		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
	public void clickStartButton() throws Throwable {
		bp.ActionClass(fl.getStartButton()).click().click().perform();
	}
	
	public void selectDistrict() throws Throwable {
		bp.ActionClass(fl.getDistrictDropDown()).click().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectSchool() throws Throwable {
		bp.ActionClass(fl.getSchoolDropDown()).click().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectStartDate() throws Throwable {
		bp.ActionClass(fl.getStartDate()).click().perform();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectEndDate() throws Throwable {
		bp.ActionClass(fl.getEndDate()).click().perform();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void ExpireCheckBox() throws Throwable {
		bp.ActionClass(fl.getExpireCheckBox()).click().perform();
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
		bp.ActionClass(fl.getFeeCategory()).click().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickFeeCategoryButton() throws Throwable {
		bp.ActionClass(fl.getFeeCategoryButton()).click().perform();
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
		bp.ActionClass(fl.getEditFeeTypeButton()).click().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickFeeTypeButton() throws Throwable {
		bp.ActionClass(fl.getFeeTypeButton()).click().perform();
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


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

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
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		bp.ActionClass(fl.getNextButton()).click().click().perform();

		Thread.sleep(2000);
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
		environment.driver.get("https://alpha4a-test.sdms2.com/Module/SDMS/Home.aspx");
	}
}