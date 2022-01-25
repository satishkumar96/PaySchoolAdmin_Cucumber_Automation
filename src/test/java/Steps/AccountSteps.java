package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AccountPageAction;

public class AccountSteps {

	private AccountPageAction apa = new AccountPageAction();

	@Given("Account Tab display")
	public void Account_Tab_display() throws Throwable {
		apa.displayAccountTab();
	}
	@When("Click on Account Tab")
	public void Click_on_Account_Tab() throws Throwable {
		Thread.sleep(3000);
		apa.clickAccountTab();
	}
	@And("check and click on Add Patron account")
	public void check_and_click_on_Add_Patron_account() throws Throwable {
		Thread.sleep(3000);
		apa.addPatronAccount();
	}
	@And("Validate Account page fields")
	public void Validate_Account_page_fields() throws Throwable {
		Thread.sleep(3000);
		apa.initialBalance();
		Thread.sleep(3000);
		apa.initialBalanceNote();
	}
	@Then("click on insert button")
	public void click_on_insert_button() throws Throwable
	{
		Thread.sleep(3000);
		apa.insertButton();
	}
	@And("click on Refresh button")
	public void click_on_Refresh_button() throws Throwable {
		Thread.sleep(3000);
		apa.refreshButton();
	}
	@When("click on edit button")
	public void click_on_edit_button() throws Throwable {
		Thread.sleep(3000);
		apa.clickEditButton();
	}
	@And("validate edit fields")
	public void validate_edit_fields() throws Throwable {
		Thread.sleep(3000);
		apa.amountToAdjust();
		Thread.sleep(3000);
		apa.adjustmentNote();
	}
	@Then("click on Save button")
	public void click_on_Save_button() throws Throwable {
		Thread.sleep(3000);
		apa.clickSaveButton();
	}
}
