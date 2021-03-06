package testRunner;

import java.time.Duration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.edge.EdgeDriver;

import Hooks.environment;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/java/Features"},
		plugin = {"pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber-reports/report.html",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"	
		},
		glue = {"Steps","Hooks"},
		monochrome = true		
		)
public class EdgeTest {
	@BeforeClass
	public static void launch() {
		System.out.println("************* Edge Test environment Start ********************");
		WebDriverManager.edgedriver().setup();
		environment.driver = new EdgeDriver();
		environment.driver.manage().window().maximize();
		environment.driver.get("https://alpha4a-test.sdms2.com/Default.aspx");
		environment.driver.manage().deleteAllCookies();
		environment.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		environment.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@AfterClass
	public static void close() {
		System.out.println("************* Edge Test environment End ********************");
		environment.driver.quit();
	}
}
