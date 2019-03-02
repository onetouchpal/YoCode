package Projectselenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle2 {
	public static void main(String[] args) {
		
	
	 System. setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	ChromeOptions cOptions = new ChromeOptions();
	Map<String, Object> chromePrefs = new HashMap<String, Object>();
	chromePrefs.put("profile.default_content_setting_values.notifications", 2);
	chromePrefs.put("credentials_enable_service", false);
	cOptions.setExperimentalOption("prefs", chromePrefs);
	cOptions.addArguments("disable-infobars");
	WebDriver driver = new ChromeDriver(cOptions);
	
	driver.get("https://www.online.citibank.co.in/");
	
	String firstHandle = driver.getWindowHandle();
	System.out.println(firstHandle);
	System.out.println(driver.getWindowHandles().size());
	driver.findElement(By.xpath("//a[@title='LOGIN NOW' and contains(@class,'visible-dektop')]")).click();
	
	
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles.size());
	System.out.println(driver.getWindowHandle());
	
	for(String handle: handles) {
		if(!handle.equals(firstHandle)) {
			driver.switchTo().window(handle);
			break;
		}
			
	
	System.out.println(driver.getWindowHandle());
	
	
	driver.findElement(By.name("password")).sendKeys("Hello");
	
	}
}
}
