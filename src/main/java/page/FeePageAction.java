package page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

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
	}
	public boolean StartButton() throws Throwable {
		return bp.enableElement(fl.getStartButton());
	}
	
	public void clickStartButton() throws Throwable {
		bp.ActionClass(fl.getStartButton()).click().click().perform();
	}

	public void selectDistrict() throws Throwable {
		bp.ActionClass(fl.getDistrictDropDown()).click().perform();

		bp.ActionClass(fl.getDistrictDropDown()).sendKeys(Keys.ENTER).perform();
	}
	public void selectSchool() throws Throwable {
		bp.ActionClass(fl.getSchoolDropDown()).click().perform();

		bp.ActionClass(fl.getSchoolDropDown()).sendKeys(Keys.ENTER).perform();
	}
	public void selectStartDate() throws Throwable {
		bp.ActionClass(fl.getStartDate()).click().perform();

		Thread.sleep(3000);

		bp.ActionClass(fl.getStartDate()).sendKeys(Keys.ENTER).perform();
	}
	public void selectEndDate() throws Throwable {
		bp.ActionClass(fl.getEndDate()).click().perform();

		Thread.sleep(3000);

		bp.ActionClass(fl.getEndDate()).sendKeys(Keys.ARROW_RIGHT,Keys.ENTER).perform();
	}
	public void ExpireCheckBox() throws Throwable {
		if(bp.selectCheckBox(fl.getExpireCheckBox())==false)
		{
			bp.ActionClass(fl.getExpireCheckBox()).click().perform();
		}
		
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
		bp.ActionClass(fl.getFeeDescription()).click().perform();
		bp.ActionClass(fl.getFeeDescription()).sendKeys("this is school fee").perform();
//		bp.SendKeys(fl.getFeeDescription(), "This is a school fees");
	}
	public void clickFeeCategory() throws Throwable {
		bp.ActionClass(fl.getFeeCategory()).click().perform();

		bp.ActionClass(fl.getFeeCategory()).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
	}
	public void clickFeeCategoryButton() throws Throwable {
		bp.ActionClass(fl.getFeeCategoryButton()).click().perform();
	}
	public void enterFeeCategoryName() throws Throwable {
		bp.ClearTextField(fl.getFeeCategoryName());
		bp.SendKeys(fl.getFeeCategoryName(), "Tution Fees");
	}
	public void enterFeeCategoryDescription() throws Throwable {
		bp.ClearTextField(fl.getFeeCategoryDescription());
		bp.SendKeys(fl.getFeeCategoryDescription(), "Tution Fees 001");

		Thread.sleep(3000);
		bp.ActionClass(fl.getFeeCategoryDescription()).sendKeys(Keys.ESCAPE).perform();
	}
	public void clickFeeType() throws Throwable {
		bp.ActionClass(fl.getEditFeeTypeButton()).click().perform();

		bp.ActionClass(fl.getEditFeeTypeButton()).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
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
		
		Thread.sleep(2000);
		
		bp.ActionClass(fl.getFreePrice()).sendKeys(Keys.ESCAPE).perform();
	}
	public boolean NextButton() throws Throwable {
		return bp.enableElement(fl.getNextButton());
	}

	public void clickNextButton() throws Throwable {
		((JavascriptExecutor) environment.driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		bp.ActionClass(fl.getNextButton()).click().click().perform();

		Thread.sleep(2000);
		((JavascriptExecutor) environment.driver).executeScript("window.scrollBy(0,-250)", "");
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