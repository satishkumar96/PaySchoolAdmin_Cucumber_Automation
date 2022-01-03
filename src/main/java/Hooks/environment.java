package Hooks;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class environment {

	public static WebDriver driver;

	@BeforeAll
	public static void before_all() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://alpha4a-test.sdms2.com/Default.aspx");
		
		new File("./test-output").deleteOnExit();
		new File("./test output").deleteOnExit();
		
	}
	
	@After
	public void doSomethingAfter(Scenario scenario){
		//		 take screenshot
		String screenShotName = scenario.getName().replace(" ", "_");
		byte[] sourcePath = ((TakesScreenshot)environment.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenShotName);
		
	}

	@AfterAll
	public static void after_all() {
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
