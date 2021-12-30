package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class environment {

	public static WebDriver driver;
	
	@BeforeAll
	public static void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://alpha4a-test.sdms2.com/Default.aspx");
	}
	
	@AfterAll
	public static void CloseBrowser() {
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
