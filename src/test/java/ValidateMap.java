import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.NDTVHome;
import common.CommonMethods;
import common.Constants;

import ObjectRepository.WeatherMap;

public class ValidateMap extends BaseTest{
	
	@Test
	public void NaviagteToMap() {
		SoftAssert softAssert = new SoftAssert();
		CommonMethods commonMethods = new CommonMethods();
		commonMethods.NavigateToMap(driver);
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions
				.elementToBeClickable(By.xpath(WeatherMap.img_weather_logo)));
		
		WebElement imgLogo = driver.findElement(By.xpath(WeatherMap.img_weather_logo));
		WebElement lbl_pin_city = driver.findElement(By.xpath(WeatherMap.img_weather_logo));
		WebElement txt_search_city = driver.findElement(By.xpath(WeatherMap.img_weather_logo));
		
		
		softAssert.assertTrue((imgLogo != null), "Image logo on weather map is available.");
		softAssert.assertTrue((lbl_pin_city != null), "lbl_pin_city on weather map is available.");
		Assert.assertTrue(txt_search_city != null, "txt_search_city on weather map is available.");
		
	}
}
