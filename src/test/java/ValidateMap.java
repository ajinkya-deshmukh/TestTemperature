import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ObjectRepository.NDTVHome;
import common.CommonMethods;
import common.Constants;

public class ValidateMap extends BaseTest{
	
	@Test
	public void NaviagteToMap() {
		CommonMethods commonMethods = new CommonMethods();
		commonMethods.NavigateToMap(driver);
	}
}
