package Hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class environment {

	public static WebDriver driver;
	
	@After
	public void takeScreenShots(Scenario scenario)
	{
	    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "image/png", "name");
	}

	}
