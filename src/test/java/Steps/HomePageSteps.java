package Steps;

import org.openqa.selenium.support.PageFactory;

import Hooks.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePageAction;
import page.ReportPageAction;
import page.ViewPatronAction;

public class HomePageSteps {

	private HomePageAction hpa = PageFactory.initElements(environment.driver, HomePageAction.class);
	private ViewPatronAction vpa = PageFactory.initElements(environment.driver, ViewPatronAction.class);
	private ReportPageAction rpa = PageFactory.initElements(environment.driver, ReportPageAction.class);

	@Then("mouse over to Patron")
	public void mouse_over_to_patron() throws Throwable {

		hpa.mouseOverPatrons();		

	}

	@Given("select Search Patron")
	public void select_search_patron() throws Throwable {

		hpa.selectSearchPatron();
	}

	@When("Search Box visible")
	public void search_box_visible() throws Throwable {
		hpa.checkSearchInputBox();
	}

	@Then("enter Patron Name or ID")
	public void enter_patron_name_or_id() throws Throwable {
		hpa.enterPatronName();
	}

	@Then("click search button")
	public void click_search_button() throws Throwable {
		hpa.clickSearchButton();
	}

	@Given("After user is on view patron page")
	public void After_user_is_on_view_patron_page() {
		hpa.getHomePageTitle();
	}
	@When("first patron display")
	public void first_patron_display() throws Throwable {
		vpa.checkFirstPatron();
		Thread.sleep(3000);
	}
	@Then("click on first patron")
	public void click_on_first_patron() throws Throwable {
		vpa.selectFirstPatron();	
	}

	@When("Select Quick Lunch Restriction button")
	public void Select_Quick_Lunch_Restriction_button() throws Throwable {
		vpa.selectQuickLunchRest();
	}

	@Then("Validate each fields")
	public void Validate_each_fields() throws Throwable {
		vpa.checkDailySpenLimit();
		vpa.checkRadioButtons();
		Thread.sleep(3000);
		vpa.checkDropDown();
	}

	@Given("check Report tab is visible and clickable")
	public void check_Report_tab_is_visible() throws Throwable {
		rpa.checkReportTab();
		Thread.sleep(3000);
	}

	@Then("click on Report Tab")
	public void click_on_Report_Tab() throws Throwable {
		rpa.clickReportTab();
		Thread.sleep(3000);
	}

	@Given("mouse over to Patron Tab")
	public void mouse_over_to_Patron_Tab() throws Throwable {
		rpa.PatronTab();
		Thread.sleep(3000);
	}
	@And("mouse over to Account Reports")
	public void mouse_over_to_Account_Reports() throws Throwable {
		rpa.AccountReports();
		Thread.sleep(3000);
	}
	@Then("Select Patron Account Activity")
	public void Select_Patron_Account_Activity() throws Throwable {
		rpa.PatronAccountActivity();
		Thread.sleep(3000);
	}
	@Given("user is on report page")
	public void user_is_on_report_page() {

	}
	@When("click on patron tab")
	public void click_on_patron_tab() throws Throwable {
		rpa.clickReportPatron();
	}
	@And("enter patronID, Last name and first name")
	public void enter_patronID_Last_name_and_first_name() throws Throwable {
		rpa.enterfield();
	}
	@And("click on search button")
	public void click_on_search_button() throws Throwable {
	}
	@Then("click on Add All button")
	public void click_on_Add_All_button() throws Throwable {
	}
}
