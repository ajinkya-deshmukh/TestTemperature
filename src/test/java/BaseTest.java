import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		// Browser Factory
		//Constants constant = new Constants();
		driver = new ChromeDriver();
		driver.get(Constants.BASE_URL);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
