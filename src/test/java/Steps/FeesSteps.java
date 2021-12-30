package Steps;

import org.openqa.selenium.support.PageFactory;

import Hooks.environment;
import io.cucumber.java.en.And;
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
}
