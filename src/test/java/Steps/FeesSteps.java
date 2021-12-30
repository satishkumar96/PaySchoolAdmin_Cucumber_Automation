package Steps;

import org.openqa.selenium.support.PageFactory;

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
		fpa.verifyFeesTab();
	}

	@When("mouse over to Fees")
	public void mouse_over_to_Fees() throws Throwable {
		fpa.mouseOverFeesTab();
	}

	@And("mouse over to Administration")
	public void mouse_over_to_Administration() throws Throwable {
		fpa.mouseOverAdminOption();
	}

	@Then("Select Manage Fees")
	public void Select_Manage_Fees() throws Throwable {
		fpa.selectManageFees();
	}

	@Given("user is on Manage Fees page")
	public void user_is_on_Manage_Fees_page() {

	}
	@When("Search text box display")
	public void Search_text_box_display() {

	}

	@When("enter {string} in text box")
	public void enter_in_text_box(String string) {

	}

	@Then("click on first school")
	public void click_on_first_school() {

	}
	@When("user click on first school")
	public void user_click_on_first_school() {
	}

	@When("click on Edit Action button")
	public void click_on_edit_action_button() {
	}

	@Then("choose fee type window displayed")
	public void choose_fee_type_window_displayed() {
	}

	@Then("select Assigned Fees")
	public void select_assigned_fees() {
	}

	@Then("click start button")
	public void click_start_button() {
	}

	@Given("user is on Required Information page")
	public void user_is_on_required_information_page() {
	}

	@When("user edit fee name, fee description and fee code")
	public void user_edit_fee_name_fee_description_and_fee_code() {
	}

	@When("validate fee category and fee type")
	public void validate_fee_category_and_fee_type() {
	}

	@Then("click on next button")
	public void click_on_next_button() {
	}

	@Given("user is on Amount & Installation page")
	public void user_is_on_amount_installation_page() {
	}

	@When("user validate fixed field")
	public void user_validate_fixed_field() {
	}

	@When("validate Tiered field")
	public void validate_tiered_field() {
	}


}
