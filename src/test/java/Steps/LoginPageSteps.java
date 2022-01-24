package Steps;


import org.openqa.selenium.support.PageFactory;

import Hooks.environment;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePageAction;
import page.LoginPageAction;

public class LoginPageSteps {

	LoginPageAction lpa = PageFactory.initElements(environment.driver, LoginPageAction.class);
	HomePageAction hpa = PageFactory.initElements(environment.driver, HomePageAction.class);

	@When("Login Page Display")
	public void login_page_display() {
	}

	@Then("fetch login page title")
	public void fetch_login_page_title() {
		lpa.PageTitle();
	}

	@Then("click on bar menu icon")
	public void click_on_bar_menu_icon() throws Throwable {
		lpa.clickBarMenu();
	}
	@Then("click on each Tab")
	public void click_on_each_tab() throws Throwable {
		lpa.clickBarMenuTabs();

	}

	@Then("click on Back to SignIn Page")
	public void click_on_back_to_sign_in_page() throws Throwable {
		lpa.clickBackToSignInPage();
	}

	@When("username and password field are display")
	public void username_and_password_field_are_display() throws Throwable {
		lpa.checkUnPwdDisplay();
	}

	@When("enter {string} and {string}")
	public void enter_and(String un, String pwd) throws Throwable {

		lpa.doLogin(un, pwd);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		
	}

	@Then("homepage should display")
	public void homepage_should_display() throws Throwable {
		hpa.getHomePageTitle();
	}

	@Then("perform logout")
	public void perform_logout() throws Throwable {
		hpa.performLogout();
	}
	
	@Then("error message should display")
	public void error_message_should_display() throws Throwable {
		lpa.getInvalidErrorMessage();
	}
	@Then("password reset button should be visible")
	public void password_reset_button_visible() throws Throwable{
		lpa.getPasswordResetButton();
	}
	@Then("password reset button should be clickable")
	public void password_reset_button_clickable() throws Throwable{
		lpa.clickPasswordResetButton();
	}
	@Then("Privacy Policy should be visible")
	public void Privacy_policy_visible() throws Throwable {
		lpa.getPrivacyPolicy();
	}
	@Then("Terms and Condition should be visible")
	public void terms_and_condition_visible() throws Throwable {
		lpa.getTermsCondition();
	}
}
