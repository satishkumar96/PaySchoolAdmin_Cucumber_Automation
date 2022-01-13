package Steps;

import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import Hooks.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FeePageAction;

public class FeesSteps {

	private FeePageAction fpa = PageFactory.initElements(environment.driver, FeePageAction.class);

	@Then("verify Fees Tab")
	public void verify_Fees_Tab() throws Throwable {
		Assert.assertTrue(fpa.verifyFeesTab());
	}

	@When("mouse over to Fees")
	public void mouse_over_to_Fees() throws Throwable {
		fpa.mouseOverFeesTab();
		Thread.sleep(3000);
	}

	@And("mouse over to Administration")
	public void mouse_over_to_Administration() throws Throwable {
		fpa.mouseOverAdminOption();
		Thread.sleep(3000);
	}

	@Then("Select Manage Fees")
	public void Select_Manage_Fees() throws Throwable {
		fpa.selectManageFees();
		Thread.sleep(3000);
	}

	@Given("user is on Manage Fees page")
	public void user_is_on_Manage_Fees_page() throws Throwable {
		fpa.ManageFeesHeading();
	}
	@When("Search text box display")
	public void Search_text_box_display() throws Throwable {
		Assert.assertTrue(fpa.verifySearchBox());
	}

	@Then("click on first school")
	public void click_on_first_school() throws Throwable {
		fpa.clickFirstSchool();
	}
	@When("user click on first school")
	public void user_click_on_first_school() {
	}

	@When("click on Edit Action button")
	public void click_on_edit_action_button() throws Throwable {
		Thread.sleep(3000);
		fpa.clickEditAction();
	}

	@Then("choose fee type window displayed")
	public void choose_fee_type_window_displayed() throws Throwable {
		Assert.assertTrue(fpa.veriyChooseFees());
	}

	@Then("select Assigned Fees")
	public void select_assigned_fees() throws Throwable {
		fpa.selectAssignedFees();
	}

	@Then("click start button")
	public void click_start_button() throws Throwable {
		Thread.sleep(3000);
		fpa.clickStartButton();
	}

	@Given("user is on Required Information page")
	public void user_is_on_required_information_page() throws Throwable {


	}

	@When("user edit fee name, fee description and fee code")
	public void user_edit_fee_name_fee_description_and_fee_code() throws Throwable {
		fpa.enterFeeName();
		//		fpa.enterFeeCode();
		fpa.enterFeeDescription();
		Thread.sleep(3000);
	}

	@When("validate fee category and fee type")
	public void validate_fee_category_and_fee_type() throws Throwable {
		fpa.clickFeeCategory();
		fpa.enterFeeCategoryName();
		fpa.enterFeeCategoryDescription();

		Thread.sleep(3000);

//				fpa.clickFeeType();
//				fpa.enterFeeTypeName();
//				fpa.enterFeeTypeDescription();
//				fpa.enterDeniedPrice();
//				fpa.enterFreePrice();
//				fpa.enterReducedPrice();
//				fpa.verifyFreePriceButtons();
//				fpa.verifyReducedPriceButtons();
//				fpa.verifyDeniedPriceButtons();
//				fpa.clickSaveButton();
//				Thread.sleep(3000);
	}

	@Then("click on next button")
	public void click_on_next_button() throws Throwable {
		fpa.clickNextButton();

	}

	@Given("user is on Amount & Installation page")
	public void user_is_on_amount_installation_page() throws Throwable {
		Assert.assertTrue(fpa.verifyAmountInstallation());
	}

	@When("user validate fixed field")
	public void user_validate_fixed_field() throws Throwable {
		fpa.clickFixedButton();
		Thread.sleep(3000);
		fpa.enterAmountDue();
		fpa.checkAllowScheduling();
	}

	@When("validate Tiered field")
	public void validate_tiered_field() throws Throwable {
		fpa.clickTieredButton();
		fpa.enterFree();
		fpa.enterReduced();
		fpa.enterDenied();

		fpa.verifyFreeButtons();
		fpa.verifyReducedButtons();
		fpa.verifyDeniedButtons();

	}

	@When("validate Variable filed")
	public void validate_variable_field() throws Throwable {
		fpa.clickVariableButton();
		fpa.getVariableText();
	}
	@Then("go to Home Page")
	public void go_to_Home_Page() throws Throwable {
		fpa.goToHomePage();
		Thread.sleep(3000);
	}

}
