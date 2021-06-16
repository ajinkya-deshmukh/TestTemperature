import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ObjectRepository.NDTVHome;
import common.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		// Browser Factory
		//Constants constant = new Constants();
		driver = new ChromeDriver();
		driver.get(Constants.BASE_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(NDTVHome.btn_accept_alert)).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
