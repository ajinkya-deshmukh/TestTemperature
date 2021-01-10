package ObjectRepository;

public class WeatherMap {
	public static String img_weather_logo = "//div[@id='logo']/img";
	public static String lbl_pin_city = "//span[contains(text(),'Pin your City')]";
	public static String  txt_search_city = "//input[@id='searchBox']";

	// Parameterized elements based on city name given in .env
	//public static String  chk_search_city = f"//input[@id='{config.city_name}' and @type='checkbox']";
	//public static String  lbl_degree_temp_on_map = f"//div[@title='{config.city_name}']//span[@class='tempRedText']";
	public static String  chk_search_city = "//input[@id='{city_name}' and @type='checkbox']";
	public static String  lbl_degree_temp_on_map = "//div[@title='{city_name}']//span[@class='tempRedText']";
}
