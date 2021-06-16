package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepository.NDTVHome;

public class CommonMethods {

	public void NavigateToMap(WebDriver driver) {
		//driver.findElement(By.xpath(NDTVHome.btn_accept_alert)).click();
		driver.findElement(By.xpath(NDTVHome.link_latest)).click();
		driver.findElement(By.xpath(NDTVHome.btn_section)).click();
		driver.findElement(By.xpath(NDTVHome.link_weather)).click();
	}
}
